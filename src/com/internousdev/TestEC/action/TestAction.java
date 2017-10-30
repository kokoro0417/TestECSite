package com.internousdev.TestEC.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.TestEC.dao.InsertActionDAO;
import com.internousdev.TestEC.dto.CardDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport implements SessionAware{

	public Map<String ,Object> session;

	public String TestText ="";

	public String execute(){

		//ArrayList<CardDataDTO> aryDTO = new ArrayList<CardDataDTO>();
		//boolean InsRet = false;

		try{
			File f = new File("C:/Users/internousdev.pppp-PC/git/TestECSite/WebContent/mtgpq.csv");
			InputStreamReader osr  = new InputStreamReader(new FileInputStream(f), "SJIS");
			BufferedReader br = new BufferedReader(osr);
			String line;


			while((line=br.readLine())!=null){
				String[] data = line.split(",", 0);
				if(data.length == 10){
					CardDataDTO cdDTO = new CardDataDTO();
					cdDTO.setCard_id(Integer.parseInt(data[0]));
					cdDTO.setExpansion(data[1]);
					cdDTO.setCard_name(data[2]);
					cdDTO.setCard_type(data[3]);
					cdDTO.setColor(data[4]);
					cdDTO.setRarity(data[5]);
					cdDTO.setMana(Integer.parseInt(data[6]));
					cdDTO.setStock(Integer.parseInt(data[7]));
					cdDTO.setPrice(Integer.parseInt(data[8]));
					cdDTO.setImgurl(data[9]);
					InsertActionDAO Insert = new InsertActionDAO();
					//aryDTO.add(cdDTO);
					try {
						Insert.insert(cdDTO);
					} catch (SQLException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}
				}
			}
			br.close();

		}catch(IOException e){
			System.out.println(e);

		}
		TestText= "てすと";

		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
