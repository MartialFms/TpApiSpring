package com.fms;

import com.fms.business.IBusinessImpl;
import com.fms.entities.Training;
import com.fms.entities.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingSpringApplication implements CommandLineRunner  {

	@Autowired
	IBusinessImpl businessImpl;

	public static void main(String[] args) {
		SpringApplication.run(TrainingSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		generateValues();
	}

	public void generateValues() {
		Category web = businessImpl.categoryRepository.save(new Category(null,"Web"));
	Category dev = businessImpl.categoryRepository.save(new Category(null,"Developpement"));
		Category fw = businessImpl.categoryRepository.save(new Category(null,"framework"));
		Category lib = businessImpl.categoryRepository.save(new Category(null,"library"));

	
		System.out.println("********** Base créée **************");
	
 businessImpl.trainingRepository.save(new Training(null,"Html","Formation language web de base en 10h",(double)350,1,true, "1.png",1,web));
		businessImpl.trainingRepository.save(new Training(null,"Css","Formation feuille de style en 8h",320,1,true, "2.png",1,web));
			businessImpl.trainingRepository.save(new Training(null,"Javascript","Formation language Js pour le web en 10h",360,1,true, "3.png",1,web));
		businessImpl.trainingRepository.save(new Training(null,"Javascript","Formation language Js developement en 14h",410,1,true, "4.png",1,web));
		businessImpl.trainingRepository.save(new Training(null,"Java","Formation language Java en 18h",500,1,true, "5.png",1,dev));
		businessImpl.trainingRepository.save(new Training(null,"Python","Formation developpement Python en 18h",520,1,true, "6.png",1,dev));
		businessImpl.trainingRepository.save(new Training(null,"Php","Formation language web de base en 8h",200,1,true, "7.png",1,web));
		businessImpl.trainingRepository.save(new Training(null,"Bootstrap","Formation sur librairy visuelle en 6h",180,1,true, "9.png",1,lib));
		businessImpl.trainingRepository.save(new Training(null,"Angular","Formation sur framework en 18h",380,1,true, "10.png",1,fw));
		businessImpl.trainingRepository.save(new Training(null,"Spring","Formation sur framework en 10h",250,1,true, "11.png",1,fw));
		businessImpl.trainingRepository.save(new Training(null,"React","Formation sur framework en 20h",380,1,true, "12.png",1,fw));
		businessImpl.trainingRepository.save(new Training(null,"VueJs","Formation sur framework en 18h",400,1,true, "13.png",1,fw));




//		businessImpl.articleRepository.save(new Article("S9","Samsung", 300,1,smartphone, "samsung.jpg"));
//		businessImpl.articleRepository.save(new Article("iPhone 10","Apple",500,1,smartphone, "iphone.jpg"));
//		businessImpl.articleRepository.save(new Article("MI11","Xiaomi",100,1,smartphone, "xiaomi.jpg"));
//		businessImpl.articleRepository.save(new Article("9 Pro","OnePlus",200,1,smartphone, "oneplus.jpg"));
//		businessImpl.articleRepository.save(new Article("Pixel 5","Google",350,1,smartphone, "googleSp.jpg"));
//		businessImpl.articleRepository.save(new Article("F3","Poco",150,1,smartphone, "poco.jpg"));
//
//		businessImpl.articleRepository.save(new Article("810","Dell",550,1,pc, "dellpc.jpg"));
//		businessImpl.articleRepository.save(new Article("F756","Asus",600,1,pc, "asuspc.jpg"));
//		businessImpl.articleRepository.save(new Article("E80","Asus",700,1,pc, "asuspc.jpg"));
//		businessImpl.articleRepository.save(new Article("Pro","MacBook",1000,1,pc, "macbook.jpg"));
//		businessImpl.articleRepository.save(new Article("Air","MacBook",1200,1,pc, "macbook.jpg"));
//
//		businessImpl.articleRepository.save(new Article("XL 5","IPad",300,1,tablet, "ipad.jpg"));
//		businessImpl.articleRepository.save(new Article("XL 7","IPad",500,1,tablet, "ipad.jpg"));
//
//
//		businessImpl.articleRepository.save(new Article("MG30","Canon",50,1,printer, "canon-mg30.jpg"));
//		businessImpl.articleRepository.save(new Article("MG50","Canon",60,1,printer, "canon-mg50.jpg"));
//		businessImpl.articleRepository.save(new Article("OfficeJet 6950","HP",50,1,printer, "hp-6950.jpg"));
//		businessImpl.articleRepository.save(new Article("WF 2830","Epson",100,1,printer, "wf-2830.jpg"));
//
//		businessImpl.articleRepository.save(new Article("7","GoPro",150,1,camera, "gopro-7.jpg"));
//		businessImpl.articleRepository.save(new Article("10","GoPro",200,1,camera, "gopro-10.jpg"));
//
//		businessImpl.articleRepository.save(new Article("HT","Panasonic",1500,1,tv, "panasonic.jpg"));
//		businessImpl.articleRepository.save(new Article("L43","Philips",450,1,tv, "philips.jpg"));
//
//
//
//
//		/*
//		businessImpl.articleRepository.save(new Article("XL 5","IPad",300,1,tablet, "testimage1.png"));
//		businessImpl.articleRepository.save(new Article("XL 7","IPad",500,1,tablet, "testimage1.png"));
//
//
//		businessImpl.articleRepository.save(new Article("MG30","Canon",50,1,printer, "testimage1.png"));
//		businessImpl.articleRepository.save(new Article("MG50","Canon",60,1,printer, "testimage1.png"));
//		businessImpl.articleRepository.save(new Article("800","HP",50,1,printer, "testimage1.png"));
//		businessImpl.articleRepository.save(new Article("3T","Epson",100,1,printer, "testimage1.png"));
//
//		businessImpl.articleRepository.save(new Article("7","GoPro",150,1,camera, "testimage1.png"));
//		businessImpl.articleRepository.save(new Article("10","GoPro",200,1,camera, "testimage1.png"));
//
//		businessImpl.articleRepository.save(new Article("HT","Panasonic",1500,1,tv, "testimage1.png"));
//		businessImpl.articleRepository.save(new Article("L43","Philips",450,1,tv, "testimage1.png"));
//		*/
//
//
//		businessImpl.userRepository.save(new User(null,"Mathieu",securityConfig.encodePassword("fms2022"),"ADMIN",true,null));
//		businessImpl.userRepository.save(new User(null,"Mathieu",securityConfig.encodePassword("fms2022"),"USER",true,null));
//		businessImpl.userRepository.save(new User(null,"Tristan",securityConfig.encodePassword("fms2022"),"USER",true,null));
//		businessImpl.userRepository.save(new User(null,"Martial",securityConfig.encodePassword("fms2022"),"USER",true,null));
//		businessImpl.userRepository.save(new User(null,"Eric",securityConfig.encodePassword("fms2022"),"USER",true,null));
//
//		businessImpl.roleRepository.save(new Role(null,"USER"));
//		businessImpl.roleRepository.save(new Role(null,"ADMIN"));
}}
