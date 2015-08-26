package com.mobenga.sports.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

import com.mobenga.sports.configuration.SportConfigConstants;
import com.mobenga.sports.model.enums.PlayedPosition;
import com.mobenga.sports.util.FileUtil;
import com.mobenga.sports.util.SystemConfigUtil;

public class StringTest {

	public static void main(String[] args) throws IOException {
		String line = "";


	BufferedReader in = new BufferedReader(  new InputStreamReader( new FileInputStream(new File(SystemConfigUtil.getPlayersDataFile()  )), "UTF-8"));
		
	while ((line = in.readLine()) != null) {
		in.readLine();

	}
		
		int a = 1;
		a++;
}
	public void enumList(){
		List<PlayedPosition> playedPositionList= new ArrayList<PlayedPosition>();
		playedPositionList.add(PlayedPosition.AMC);
		playedPositionList.add(PlayedPosition.AMR);
		playedPositionList.add(PlayedPosition.FW);
		playedPositionList.add(PlayedPosition.MR);

		 StringBuilder result = new StringBuilder();
		   for(int i = 0; i < playedPositionList.size() ; i++){
			   
			   result.append(playedPositionList.get(i).toString());
			   
			   if(i != (playedPositionList.size()-1)){//No need to add " " for last item
				   result.append(" ");
			   }
		   }
		   
	}
	public void enumPlayedPositionsTest(){
		String data = "-FW-ML-MR-";
		List<PlayedPosition> playedPositionsList= new ArrayList<PlayedPosition>();
		
		String tempString[] = data.split(SportConfigConstants.HYPHEN_SEPERATOR);
		
		for (int i=0; i < tempString.length; i++){
			if("AMC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.AMC);
			}else if("AML".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.AML);
			}if("AMR".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.AMR);
			}else if("DC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.DC);
			}else if("DL".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.DL);
			}else if("DMC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.DMC);
			}else if("FW".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.FW);
			}else if("MC".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.MC);
			}else if("ML".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.ML);
			}else if("MR".equals(tempString[i])){
				playedPositionsList.add(PlayedPosition.MR);
			}
		}
	}
	
	public void stringTest(){
		StringBuilder result = new StringBuilder();
		String line = "3,5435,2014/2015,4,206,es,pt,La Liga,SLL,Cristiano,Ronaldo,5583,TRUE,"
				+ "TRUE,52,Real Madrid,-AML-AMR-FW-,30,185,80,Forward,21,0,1871,8.489047619"
				+ ",29,10,3,1,5.904761905,1.380952381,11,Cristiano Ronaldo,"
				+ "FALSE,\"AM(LR),FW,CB\",81.25";
		if(line.contains("\"")){
			result.append(line.substring(0, line.indexOf("\"")));
	
			String tempString[] = line.substring(line.indexOf("\"") +1, line.lastIndexOf("\"")).split(SportConfigConstants.CVS_COMMA_SEPERATOR);
			
			for (int i=0; i < tempString.length; i++){
				result.append(tempString[i]);
				if(i < (tempString.length-1)){//Dont need to add for the last occurence
					result.append("-");
				}
			}
			
			result.append(line.substring(line.lastIndexOf("\"")+1));
			result.toString();
		}
		
		
	}

}
