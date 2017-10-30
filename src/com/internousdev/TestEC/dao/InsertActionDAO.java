package com.internousdev.TestEC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.TestEC.dto.CardDataDTO;
import com.internousdev.TestEC.util.DBConnector;

public class InsertActionDAO {

	public boolean insert(CardDataDTO cdDTO) throws SQLException {
		boolean ret = false;

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO card_data VALUES(?,?,?,?,?,?,?,?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cdDTO.getCard_id());
			ps.setString(2, cdDTO.getExpansion());
			ps.setString(3, cdDTO.getCard_name());
			ps.setString(4, cdDTO.getCard_type());
			ps.setString(5, cdDTO.getColor());
			ps.setString(6, cdDTO.getRarity());
			ps.setInt(7, cdDTO.getMana());
			ps.setInt(8, cdDTO.getStock());
			ps.setInt(9, cdDTO.getPrice());
			ps.setString(10, cdDTO.getImgurl());

			ps.execute();
			System.out.println("INSERT_CONP");
			ret = true;


		}catch(Exception e){
			e.printStackTrace();

		}

		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();

		}

		return ret;
	}

}
