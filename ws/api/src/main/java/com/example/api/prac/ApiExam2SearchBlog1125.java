package com.example.api.prac;// 네이버 검색 API 예제 - 블로그 검색
import com.example.api.ItemDto;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class ApiExam2SearchBlog1125 {

    public static void main(String[] args) {
        ApiExam2SearchBlog1125 api = new ApiExam2SearchBlog1125();
        String result = api.gateData();     // 서버가 준 데이터(json 구조를 가진 문자열)

        System.out.println("api data"+result);

        // 상품리스트반환 List<GoodsDTO>
        List<GoodsDTO> list=api.parseItem(result);//모델

    }

    public List<GoodsDTO> parseItem(String result){

        System.out.println("parseItem 시작"+result);
        List<GoodsDTO> list=new ArrayList<>();

        // 1. 서버에서 받은 문자열 json -> 실제 jsonObject 변환
        // 2. items 꺼내기
        // 3. items jsonArray -> List<GoodsDTO>

        JSONObject resultJson = new JSONObject(result);
        System.out.println(resultJson);

        // 2.
        JSONArray jsonArray =resultJson.getJSONArray("items");

        for(int i=0; i<jsonArray.length();i++){
            JSONObject jsonItem=jsonArray.getJSONObject(i); //배열 요소 꺼내기

            String title=jsonItem.getString("title");
            String link=jsonItem.getString("link");
            String lprice=jsonItem.getString("lprice");
            String image=jsonItem.getString("image");
            String mallName=jsonItem.getString("mallName");

            System.out.println(title);
            System.out.println(link);
            System.out.println(lprice);
            System.out.println(image);
            System.out.println(mallName);

            // GoodsDTO
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setLink(link);
            goodsDTO.setImage(image);
            goodsDTO.setLprice(lprice);
            goodsDTO.setMallName(mallName);
            goodsDTO.setTitle(title);

            list.add(goodsDTO);




        }

        return  list;
    }



    public String gateData() {
        String clientId = "aLGdPg9nnWy1hVpgYBJ9"; //애플리케이션 클라이언트 아이디
        String clientSecret = "b4iFZvFMaM"; //애플리케이션 클라이언트 시크릿


        String text = null;
        try {
            text = URLEncoder.encode("케이크", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("검색어 인코딩 실패",e);
        }


        String apiURL = "https://openapi.naver.com/v1/search/shop?query=" + text;    // JSON 결과
        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과


        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders);


        System.out.println(responseBody);

        return responseBody;
    }


    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }


            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 오류 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);


        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();


            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }


            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
        }
    }
}