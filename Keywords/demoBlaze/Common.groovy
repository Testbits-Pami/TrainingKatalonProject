package demoBlaze

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.helper.KeywordHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




public class Common {

	/**
	 * This function enables user to generate random Username
	 * 
	 * 
	 * 
	 * @param length Specify length of username
	 * @return New Generated Username
	 */
	@Keyword(keywordObject='Signup')
	def static generateRandomString(int length) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder username = new StringBuilder();
		Random rand = new Random();
		for (int i = 0; i < length; i++) {
			username.append(chars.charAt(rand.nextInt(chars.length())));
		}

		KeywordUtil.logInfo('New Username generated: ' + username)

		return username.toString()
	}

	/**
	 * Login process
	 * 
	 * 
	 * @param username new Username
	 * @param password Password of user
	 */
	@Keyword(keywordObject='Login')
	def static void loginIntoDemoBlaze(String username, String password) {
		WebUI.click(findTestObject('Object Repository/Page_STORE/a_Log in'))
		WebUI.setText(findTestObject('Object Repository/Page_STORE/input_LoginUsername'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/input_LoginPassword'), password)
		WebUI.click(findTestObject('Object Repository/Page_STORE/button_LogIn'))
		WebUI.verifyElementPresent(findTestObject('Page_STORE/a_Welcome qatb_demo1', [('username') : username]), 0)
		WebUI.closeBrowser()
	}
}
