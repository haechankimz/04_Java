package edu.kh.io.pack4.model.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterService {
	
	/* 문자 기반 스트림
	 * 
	 * - 2byte 문자(char) 단위로 입/출력 하는 스트림
	 * 
	 * - Reader(입력), Writer(출력) 최상위 인터페이스
	 *
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달
	 */

	/**
	 * 문자 기반 파일 입력(파일 읽어오기)
	 * + 보조 스트림 Buffered 사용
	 */
	public void fileInput() {
		
		FileReader fr = null; // 문자 기반 파일 입력 스트림
		BufferedReader br = null; // 문자 기반 보조 스트림
		
		try {
			// 문자 기반 스트림 생성
			fr = new FileReader("/io_test/노래가사2.txt");
			
			// 보조 스트림 생성
			br = new BufferedReader(fr);
			
//			br.readLine();
			String line = null; // 한 줄을 읽어와 저장할 변수
			
			while(true) {
				
				line = br.readLine();
				
				if(line == null) { // 더 이상 읽어올 내용이 없을 때
					break; // 반복 종료
				}
				System.out.println(line); // 읽어온 내용이 있으면 콘솔에 출력
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 사용 완료된 스트림 객체 메모리 반환(제거, 닫기)
			// 보조 스트림만 close()해도 연결된 기반 스트림도 같이 close()됨
			
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**
	 * 문자 기반 파일 출력
	 * + 보조 스트림 Buffered 이용 
	 */
	public void fileOutput() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("오늘은 2월 16일 금요일 입니다 \n");
		sb.append("벌써 금요일이라니 기분이 좋아요 \n");
		sb.append("하하하하후후 \n");
		sb.append("졸 \n");
		sb.append("리 \n");
		sb.append("다 \n");
		
		String content = sb.toString();
		
		// content에 저장된 문자열을
		// /io_test/출력테스트.txt 파일로 출력하기
		
		FileWriter fw =null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("/io_test/출력테스트.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(content); // content에 저장된 내용을 연결된 파일에 출력
			
			bw.flush();
			
			System.out.println("출력 완료");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				// close() 구문에 flush()가 내장되어 있음
				if(bw != null) bw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
