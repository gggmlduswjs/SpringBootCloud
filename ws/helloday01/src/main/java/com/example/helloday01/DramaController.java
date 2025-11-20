package com.example.helloday01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DramaController {

    @GetMapping("/drama")
    public String drama(Model model) {

        String[] actorArray = {
                "이제훈",
                "김의성",
                "표예진",
                "장혁진"
        };

        /*
        Drama drama = new Drama(
                "모범택시",
                "억울한 피해자를 대신해 복수를 해결하는 ‘무지개 운수’ 팀의 이야기",
                actorArray
        );

        */

        Drama drama = new Drama(
                "모범택시",
                "억울한 피해자를 대신해 복수를 해결하는 ‘무지개 운수’ 팀의 이야기",
                new String[]{
                        "이제훈",
                        "김의성",
                        "표예진",
                        "장혁진",
                        "배유람"
                },
                 "금 · 토 / 오후 09:50 ~", // ← time은 네 번째 매개변수
                "movie.png"  // 🔥 필수!
        );

        model.addAttribute("drama", drama);
        return "drama"; // drama.html
    }
}
