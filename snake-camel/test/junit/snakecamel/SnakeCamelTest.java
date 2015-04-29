package junit.snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {
	@Test
	public void スネークケースをが取得できる() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual=scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void キャメルケースが取得できる() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual=scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	@Test
	public void 大文字が取得できる() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "A";
		String actual=scu.capitalize("a");
		assertThat(actual, is(expected));
	}
	@Test
	public void 小文字が取得できる() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "a";
		String actual=scu.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	

}
