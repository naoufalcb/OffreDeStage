package com.example;

import com.example.repository.SkillRepository;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {





    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {




        /*Student student = Student.builder()
                .first_name("Mansour")
                .last_name("MANSOUR")
                .internee(false)
                .skills(new ArrayList<>())
                .build();




        Skill skill = Skill.builder()
                .skill_name("CSS")
                .build();

        studentRepository.save(student);
        skillRepository.save(skill);*/



//        Student student1 = new Student("Naoufal","NAOUFAL",false);
//        Student student2 = new Student("Ahmed","AHMED",true);
//
//        Skill skill1 = new Skill("JavaScript");
//        Skill skill2 = new Skill("HTML");



//        student1.addSkill(skill1);
//        student1.addSkill(skill2);
//        student2.addSkill(skill1);
//
//        studentRepository.save(student1);
//        studentRepository.save(student2);
//        skillRepository.save(skill1);
//
//        skillRepository.save(skill2);


////        Set<Skill> skl2 = ;
////        Student st2 = Student.builder()
////                .first_name("Ahmed")
////                .last_name("ahmed")
////                .internee(true)
////                .skills(skl2)
////                .build();
////
////        Set<Skill> skl1= Skill.builder()
////                .skill_name("JavaScript")
////                .build();
//
    }
}
