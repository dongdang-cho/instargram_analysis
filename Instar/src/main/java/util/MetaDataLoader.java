package util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MetaDataLoader {
	private static Properties pathProFile = new Properties();
	private static Properties seleniumProfile = new Properties();
	private static Properties urlProfile = new Properties();
	private static Properties tagProfile = new Properties();
	private static Properties accountProfile = new Properties();
	private static Properties dbInfoProfile = new Properties();
	private static Properties dbCmdProfile = new Properties();
	static {
		try {
			pathProFile.load(new FileInputStream("path.properties"));
			seleniumProfile.load(new FileInputStream("seleniumInfo.properties"));
			urlProfile.load(new FileInputStream("url.properties")); 
			tagProfile.load(new FileInputStream("tag.properties"));
			accountProfile.load(new FileInputStream("account.properties"));
			dbInfoProfile.load(new FileInputStream("dbinfo.properties"));
			dbCmdProfile.load(new FileInputStream("dbcmd.properties"));
			
			DBConnManager.dbLoading(dbInfoProfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	/**
	 * @return the pathProFile
	 */
	public static Properties getPathProFile() {
		return pathProFile;
	}
	/**
	 * @return the seleniumProfile
	 */
	public static Properties getSeleniumProfile() {
		return seleniumProfile;
	}
	/**
	 * @return the seedURLProfile
	 */
	public static Properties getSeedURLProfile() {
		return urlProfile;
	}
	/**
	 * @return the tagProfile
	 */
	public static Properties getTagProfile() {
		return tagProfile;
	}
	/**
	 * @return the idProfile
	 */
	public static Properties getIdProfile() {
		return accountProfile;
	}
	public static Properties getDbCmdProfile() {
		return dbCmdProfile;
	}

	
	
	
}
