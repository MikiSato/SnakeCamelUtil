package junit.snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {
	@Test
	public void �X�l�[�N�P�[�X�����擾�ł���() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual=scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void �L�������P�[�X���擾�ł���() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual=scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	@Test
	public void �啶�����擾�ł���() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "A";
		String actual=scu.capitalize("a");
		assertThat(actual, is(expected));
	}
	@Test
	public void ���������擾�ł���() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String expected = "a";
		String actual=scu.uncapitalize("A");
		assertThat(actual, is(expected));
	}
	
	

}
