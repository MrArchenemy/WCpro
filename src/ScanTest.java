import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class ScanTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testScan1() throws IOException {
		String filepath = "data1.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("test", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan2() throws IOException {
		String filepath = "data2.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("TEST", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan3() throws IOException {
		String filepath = "data3.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("TeSt", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan4() throws IOException {
		String filepath = "data4.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("TEST", 2);
		correct_scan.put("test", 1);
		correct_scan.put("TeSt", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan5() throws IOException {
		String filepath = "data5.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("Let", 1);
		correct_scan.put("s", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan6() throws IOException {
		String filepath = "data6.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("night", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan7() throws IOException {
		String filepath = "data7.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("I", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan8() throws IOException {
		String filepath = "data8.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("TABLE", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan9() throws IOException {
		String filepath = "data9.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("see", 1);
		correct_scan.put("Box", 1);
		correct_scan.put("d", 1);
		correct_scan.put("c", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan10() throws IOException {
		String filepath = "data10.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("test", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan11() throws IOException {
		String filepath = "data11.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("lest", 1);
		correct_scan.put("night", 1);
		correct_scan.put("I", 1);
		correct_scan.put("table", 2);
		correct_scan.put("see", 1);
		correct_scan.put("c", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	@Test
	public void testScan12() throws IOException {
		String filepath = "data12.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("Restore", 1);
		correct_scan.put("buttons", 1);
		correct_scan.put("Find", 2);
		correct_scan.put("Previous", 1);
		correct_scan.put("Next", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan13() throws IOException {
		String filepath = "data13.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("Notepad", 1);
		correct_scan.put("enhancements", 1);
		correct_scan.put("bug-fixes", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan14() throws IOException {
		String filepath = "data14.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("NppExport", 1);
		correct_scan.put("v", 1);
		correct_scan.put("-bit", 1);
		correct_scan.put("x", 1);
		correct_scan.put("only", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan15() throws IOException {
		String filepath = "data15.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("adyfv", 1);
		correct_scan.put("ds", 1);
		correct_scan.put("D", 1);
		correct_scan.put("kpuigsdf", 1);
		correct_scan.put("a", 1);
		correct_scan.put("ekoprehg", 1);
		correct_scan.put("clvCfd", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan16() throws IOException {
		String filepath = "data16.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("https", 1);
		correct_scan.put("notepad-plus-plus", 1);
		correct_scan.put("org", 1);
		correct_scan.put("features", 1);
		correct_scan.put("ghost-typing", 1);
		correct_scan.put("html", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan17() throws IOException {
		String filepath = "data17.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("Fix", 1);
		correct_scan.put("macro", 1);
		correct_scan.put("playing", 1);
		correct_scan.put("back", 1);
		correct_scan.put("crash", 1);
		correct_scan.put("issue", 1);
		correct_scan.put("on", 1);
		correct_scan.put("new", 1);
		correct_scan.put("added", 1);
		correct_scan.put("find", 2);
		correct_scan.put("previous", 1);
		correct_scan.put("and", 1);
		correct_scan.put("next", 1);
		correct_scan.put("buttons", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan18() throws IOException {
		String filepath = "data18.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("Keep", 1);
		correct_scan.put("Doc", 1);
		correct_scan.put("Switcher", 1);
		correct_scan.put("s", 1);
		correct_scan.put("ordering", 1);
		correct_scan.put("in", 1);
		correct_scan.put("sync", 1);
		correct_scan.put("with", 1);
		correct_scan.put("Tab", 1);
		correct_scan.put("bar", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan19() throws IOException {
		String filepath = "data19.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("ne", 1);
		correct_scan.put("Comment", 1);
		correct_scan.put("malfunctioning", 1);
		correct_scan.put("with", 1);
		correct_scan.put("HTML", 1);
		correct_scan.put("XML", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan20() throws IOException {
		String filepath = "data20.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("testdhsve", 1);
		correct_scan.put("v", 1);
		correct_scan.put("g", 1);
		correct_scan.put("osdv", 1);
		correct_scan.put("vspdSVSDLKV", 1);
		correct_scan.put("KSXCV", 1);
		correct_scan.put("kjn", 1);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan21() throws IOException {
		String filepath = "data21.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("adyfv", 200);
		correct_scan.put("ds", 200);
		correct_scan.put("D", 200);
		correct_scan.put("kpuigsdf", 200);
		correct_scan.put("a", 200);
		correct_scan.put("ekoprehg", 200);
		correct_scan.put("clvCfd", 200);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
	
	@Test
	public void testScan22() throws IOException {
		String filepath = "data22.txt";
		Map<String, Integer> correct_scan =  new TreeMap<String, Integer>();
		correct_scan.put("see", 200);
		correct_scan.put("Box", 200);
		correct_scan.put("d", 200);
		correct_scan.put("c", 200);
	    assertEquals(correct_scan, Scan.scan(filepath));
	}
}
