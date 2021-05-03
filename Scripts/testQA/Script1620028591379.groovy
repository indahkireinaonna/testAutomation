import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/a_New recommendations'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Home'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Home'), 'Home')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Explore'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Explore'), 'Explore')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Library'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Library'), 'Library')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/span_Search'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/span_Search'), 'Search')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/tp-icon_search'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/a_Sign in'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Todays hits'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Todays hits'), "Today's hits")
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/ul_The Hit List'), 0)
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Pop'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Pop'), 'Pop')
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/a_New releases'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/ul_list new release'), 0)
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Blessings Ramadan'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Blessings Ramadan'), 'Blessings Ramadan')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-ACCOMPANY YOUR DAY OF FASTING'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-ACCOMPANY YOUR DAY OF FASTING'),
	'ACCOMPANY YOUR DAY OF FASTING')
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Indonesian playlists'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Indonesian playlists'),'Indonesian playlists')
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/ul_Islamic'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Todays Dangdut'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Todays Dangdut'), "Today's Dangdut")
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt-Relax'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music/yt-Relax'), 'Relax')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/ul_list_relax'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music/yt_Penyejuk Hati'), 0)
WebUI.takeScreenshot()
WebUI.sendKeys(null, Keys.chord(Keys.HOME))

//explore
WebUI.click(findTestObject('Object Repository/Page_YouTube Music/yt-Explore'))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music explore/yt-New releases'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music explore/yt-Charts'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music explore/yt-Charts'), 'Charts')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music explore/yt-Moods  genres'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube Music explore/yt-Moods  genres'), 'Moods & genres')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music explore/a_New music videos'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music explore/a_New albums  singles'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube Music explore/a_Moods  genres'), 0)

WebUI.click(findTestObject('Object Repository/Page_YouTube Music explore/yt-New releases'))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore new rilis/a_Albums  singles'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore new rilis/div_list released'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore new rilis/div_music videos'), 0)
WebUI.sendKeys(null, Keys.chord(Keys.END))
WebUI.takeScreenshot()
WebUI.sendKeys(null, Keys.chord(Keys.HOME))
WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_YouTube Music explore/yt-Charts'))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore charts/a_Top music videos'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore charts/button_Global'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore charts/ul_top artis'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore charts/yt-harts'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore charts/yt-Top artists'), 0)

WebUI.click(findTestObject('Object Repository/Page_YouTube explore charts/button_Global'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube explore charts/yt-select-menu'), 0)
WebUI.takeScreenshot()
WebUI.back()

//library
WebUI.click(findTestObject('Object Repository/Page_YouTube Music/yt-Library'))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube/span_Sign in'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube/span_to continue to YouTube Music'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube/span_to continue to YouTube Music'),
	'to continue to YouTube Music')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube/input_email'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube/div_Next'), 0)
WebUI.back()

judullagu= 'not alone seventeen'
WebUI.click(findTestObject('Object Repository/Page_YouTube Music/tp-icon_search'))
WebUI.setText(findTestObject('Object Repository/Page_YouTube Music/input_Search_input'), judullagu)
WebUI.takeScreenshot()
WebUI.sendKeys(findTestObject('Object Repository/Page_YouTube Music/input_Search_input'), Keys.chord(Keys.ENTER))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/a_Albums'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/a_Songs'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/a_Videos'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/a_Community playlists'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/yt-Artists'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/yt-Top result'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_YouTube search/yt-Top result'), 'Top result')
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/yt-icon_Top result-play'), 0)
WebUI.click(findTestObject('Object Repository/Page_YouTube search/yt-icon_Top result-play'))
WebUI.takeScreenshot()
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/div_Lyrics'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/div_Up next'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_YouTube search/divplay'), 0)

WebUI.closeBrowser()
