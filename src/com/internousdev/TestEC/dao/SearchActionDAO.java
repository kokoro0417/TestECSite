package com.internousdev.TestEC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.TestEC.dto.CardDataDTO;
import com.internousdev.TestEC.util.DBConnector;

public class SearchActionDAO {

	public ArrayList<CardDataDTO> search(String expansion,String card_name) throws SQLException {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		ArrayList<CardDataDTO> SearchDataList = new ArrayList<CardDataDTO>();

		String sql = "SELECT * FROM card_data";
		String sqltmp ="";
		int sqlcount = 0;


		if(!(expansion.equals(""))){
			sqltmp = " expansion = '" + expansion + "'";
			sqlcount++;
		}
		if(!(card_name.equals(""))){
			sqltmp = sqltmp + " card_name like '" + card_name + "%'";
			sqlcount++;
		}

		if(sqlcount > 0){
			sql = sql+" WHERE"+ sqltmp ;
		}
		System.out.println(sql);

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CardDataDTO SDDTO = new CardDataDTO();
				SDDTO.setExpansion(rs.getString("expansion"));
				SDDTO.setCard_name(rs.getString("card_name"));
				SDDTO.setCard_type(rs.getString("card_type"));
				SDDTO.setColor(rs.getString("color"));
				SDDTO.setRarity(rs.getString("rarity"));
				SDDTO.setMana(rs.getInt("mana"));
				SDDTO.setStock(rs.getInt("stock"));
				SDDTO.setPrice(rs.getInt("price"));
				SDDTO.setImgurl(rs.getString("imgurl"));
				SearchDataList.add(SDDTO);
			}
			System.out.println("Search_CONP");

		}catch(Exception e){
			e.printStackTrace();

		}

		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();

		}

		return SearchDataList;
	}

}
