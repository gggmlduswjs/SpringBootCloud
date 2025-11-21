package com.acorn.day2Batis;


import lombok.Data;

@Data
public class Member {
    String id;
    String name;
    String email;
}


/*


테이블명과 객체의 속성이 다를 때  resultmap 사용

CREATE TABLE membertbl (
    m_id VARCHAR2(50) PRIMARY KEY,
    m_name VARCHAR2(100) NOT NULL,
    m_email VARCHAR2(100) UNIQUE NOT NULL
);

INSERT INTO membertbl (m_id, m_name, m_email) VALUES ('user01', '김철수', 'kimcs@example.com');
INSERT INTO membertbl (m_id, m_name, m_email) VALUES ('user02', '이영희', 'leeyh@example.com');
INSERT INTO membertbl (m_id, m_name, m_email) VALUES ('user03', '박민수', 'parkms@example.com');
INSERT INTO membertbl (m_id, m_name, m_email) VALUES ('user04', '최다혜', 'choidh@example.com');
INSERT INTO membertbl (m_id, m_name, m_email) VALUES ('user05', '정우성', 'jungws@example.com');

 */