package com.internousdev.TestEC.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.TestEC.dao.SearchActionDAO;
import com.internousdev.TestEC.dto.CardDataDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport implements SessionAware{

	public Map<String ,Object> session;
	private int CategoryType = 0;
	private String SearchText = "";
	//private String SearchCategory = "none";
	public ArrayList<CardDataDTO> SearchDataList = new ArrayList<CardDataDTO>();

	public String Search() throws SQLException{

		SearchActionDAO SADAO = new SearchActionDAO();


		String SearchExp = "";

		switch(CategoryType){
		case 1:
			SearchExp = "ORI";
		break;
		case 2:
			SearchExp = "BFZ";
		break;
		case 3:
			SearchExp = "OGW";
		break;
		case 4:
			SearchExp = "SOI";
		break;
		case 5:
			SearchExp = "EMN";
		break;
		case 6:
			SearchExp = "KLD";
		break;
		case 7:
			SearchExp = "AER";
		break;
		case 8:
			SearchExp = "AKH";
		break;
		case 9:
			SearchExp = "HOU";
		break;
		case 10:
			SearchExp = "XLN";
		break;
		case 0:
		default:
		}

		SearchDataList = SADAO.search(SearchExp, SearchText);

		Iterator<CardDataDTO> itr = SearchDataList.iterator();
		if(!(itr.hasNext())){
			//message = "検索結果がありません";
		}else{
			//message = "";

		}

		return SUCCESS;
	}

	public String getSearchText() {
		return SearchText;
	}



	public void setSearchText(String searchText) {
		SearchText = searchText;
	}



	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public int getCategoryType() {
		return CategoryType;
	}

	public void setCategoryType(int categoryType) {
		CategoryType = categoryType;
	}

/*	public String getSearchCategory() {
		return SearchCategory;
	}

	public void setSearchCategory(String searchCategory) {
		SearchCategory = searchCategory;
	}*/



}
