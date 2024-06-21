package com.khmall.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khmall.dto.Pig;
import com.khmall.mapper.PigMapper;

@Service
public class PigService {

	@Autowired
	private PigMapper pigMapper;
	
	public List<Pig> getAllPigs(){
		return pigMapper.getAllPigs();
	}
	
	//getPigById
	public Pig getPigById(int pig_id){
		return pigMapper.getPigById(pig_id);
	}
	
	//uploadPig
	public void uploadPig(String pig_name, int pig_age, MultipartFile file) {
		// 파일 이름 가져온 다음
		String fileName = file.getOriginalFilename();
		System.out.println("file Name : " + fileName);
		
		//String uploadDir = "C:/Users/user1/Desktop/pig_img/";
		//String uploadDir = "C:/Users/user1/servlet_jsp_workspace/demoProject6_mybatis-mapper-select-image/src/main/resources/static/images";
		// 맨 끝에 /로 닫아주지 않으면 static/images/안에 이미지가 저장되는 것이 아니라
		// static 바로 밑에 생성되기 때문에 이미지가 보이지 않으므로 반드시 마지막에 /를 넣어줘야함
		
		String uploadDir = "C:/Users/user1/servlet_jsp_workspace/demoProject6_mybatis-mapper-select-image/src/main/resources/static/images/";
		File imgFile = new File(uploadDir + fileName);
		
		// 나중에 이미지 파일을 저장하는 폴더가 존재하지 않을 경우 생성하는 코드
		//우리가 저장하고자하는 파일 경로 설정
		
		if(!imgFile.exists() /*만약에 이미지 폴더가 존재하지 않을 때가 true인 ! 추가*/)  {
			//폴더생성하기
			imgFile.mkdirs(); 
		}
		
		try {
			file.transferTo(imgFile); // 이미지를 폴더에 저장하는 코드 
			//업로드 한 다음에 저장되 이미지 경로와 함께 돼지 정보를 저장하는 서비스를 작성
			Pig pig = new Pig();
			pig.setPig_name(pig_name);
			pig.setPig_age(pig_age);
			pig.setPig_image_path(uploadDir); // 파일 이름만 저장
			// 만약에 파일경로와 이름을 같이 저장하길 원한다면 아래 코드를 사용
			//pig.setPig_image_path("/images/"+uploadDir); //-> DB 파일 경로에 C:/Users/user1/Desktop/pig_img/ 로 저장됨
			pig.setPig_image_path("/images/"+fileName); // uploadDir -> fileName 변경
			
			pigMapper.uploadPig(pig); //DB에 저장
			System.out.println("파일 업로드 Service를 성공적으로 완료 했습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	//나중에 이미지 업로드에서 파일 저장경로에 대한 함수만 따로 설정
	//public String folder & image 체크
}
