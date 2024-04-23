package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : Æ¯Á¤ µ¥ÀÌÅÍ°¡ Çü½ÄÀÌ ¸Â´ÂÁö ºñ±³ÇÏ·Á°í ÇÒ °æ¿ì µ¥ÀÌÅÍ Çü½ÄÀ» ÁöÁ¤ÇÏ´Â Å¬·¡½º
//Matcher : Æ¯Á¤ ÆĞÅÏÀÇ ÇüÅÂ°¡ ¸Â´ÂÁö ºñ±³ÇÏ´Â Å¬·¡½º
//=Á¤±Ô½Ä(Reg Expression) => regex
public class PatternExam1 {
	public static void main(String[] args) {	//¾ÆÀÌµğºñ¹ø µî ¼³Á¤½Ã »ç¿ë °¡´É
		String[] data = {"bag","rarit0507","9to6","8to5","single","Mom","ABC","Å°¾Æ´©¸®ºê½º","-_-"}; 
		//°ËÁõ½Ä ¸¸µé±â
		Pattern p = Pattern.compile("[a-z]*");	//¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("[0-9a-z]*");	//¼ıÀÚ¿Í ¿µ¹® ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("[A-Za-z]*");	//¿µ¹® ´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("s[A-Za-z]*");		//s·Î ½ÃÀÛÇÏ¸é¼­ ¿µ¹® ´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("[°¡-ÆR]*");	//ÇÑ±Û·Î¸¸ ±¸¼ºµÈ µ¥ÀÌÅÍ
		//Pattern p = Pattern.compile("e$");		//Æ¯Á¤ ¹®ÀÚ·Î ³¡³ª´Â °æ¿ì ¹®ÀÚ µÚ¿¡ $
		//Pattern p = Pattern.compile("^b");		//Æ¯Á¤ ¹®ÀÚ·Î ½ÃÀÛÇÏ´Â °æ¿ì ¹®ÀÚ ¾Õ¿¡ ^
		//Pattern p = Pattern.compile("^[0-9]*");	//¸ğµç °ªÀÌ ¼ıÀÚÀÎ µ¥ÀÌÅÍ
		
		for(int i=0;i<data.length;i++) {
			Matcher m = p.matcher(data[i]);	//ctrlShiftO - util
			if(m.matches()) {
				System.out.println("Çü½Ä ÀÏÄ¡ : "+data[i]);
			}
		}
	}

}
