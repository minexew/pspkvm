/*
	Field maps, &c for semichordal keyboard implementation.
	/AJ Milne
*/ 

package javax.microedition.lcdui;

// We put the metakey mapping/enum in its own class because
/// Java 1.4 and below don't do enums. Makes it neater.
public class SC_Keys {

	// CHR in the metamap means this isn't a metakey, but a character
	public static final int CHR=127;

	// NUL in the metamap means this isn't mapped to anything, and should 
	// be ignored
	public static final int NUL=0;

	// Various control/latch/state/nav keys
	public static final int ENT=1;
	public static final int INS=2;
	public static final int BSP=3;
	public static final int DEL=4;
	public static final int ESC=5;
	public static final int TAB=6;
	public static final int CUP=7;
	public static final int CLF=8;
	public static final int CDN=9;
	public static final int CRT=10;
	public static final int PUP=11;
	public static final int HME=12;
	public static final int PDN=13;
	public static final int END=14;
	public static final int ALT=15;
	public static final int SEL=16;
	public static final int CLK=17;
	public static final int CTL=18;
	public static final int DSP=19;
	
  // The map of non-meta characters. Note that where there are 
  // valid meta characters, space is set, but these are just 
  // placeholders (and using space makes the table more legible)
	static final char[] chordal_map_chars = {
		' ', 'e', 't', 's', ' ', 'E', 'T', 'S',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'o', 'a', 'u', 'i', 'O', 'A', 'U', 'I',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'n', 'p', 'd', 'h', 'N', 'P', 'D', 'H',
		'\'', ';', '_', '/', '"', ':', '^', '?',
		'l', 'w', 'v', 'm', 'L', 'W', 'V', 'M',
		',', 'q', '.', '-', '?', 'Q', ' ', ' ',
		'f', 'g', 'c', 'r', 'F', 'G', 'C', 'R',
		'+', '=', '*', '!', ' ', '@', '&', '\\',
		'b', 'j', 'y', 'k', 'B', 'J', 'Y', 'K',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'z', 'x', '0', '1', 'Z', 'X', '%', '|',
		'<', '`', '$', ' ', '>', '#', '~', ' ',
		'6', '7', '8', '9', '(', ')', ' ', ' ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'2', '3', '4', '5', '[', ']', '{', '}',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

	static boolean isLCAlpha(int x) {
		if (!isChar(x)) {
			return false; }
		if (chordal_map_chars[x] > 'z') {
			return false; }
		return (chordal_map_chars[x] >= 'a'); }

	static boolean isUCAlpha(int x) {
		if (!isChar(x)) {
			return false; }
		if (chordal_map_chars[x] > 'Z') {
			return false; }
		return (chordal_map_chars[x] >= 'A'); }

	// The metakey mapping to the chordal keyboard
	public static final int[] chordal_map_meta = {
			CHR, CHR, CHR, CHR, ENT, CHR, CHR, CHR,
			INS, BSP, DEL, ESC, NUL, NUL, NUL, NUL,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CUP, CLF, CDN, CRT, CUP, CLF, CDN, CRT,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, NUL, TAB,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, NUL, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			NUL, NUL, NUL, NUL, NUL, NUL, NUL, NUL,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, NUL, CHR, CHR, CHR, NUL,
			CHR, CHR, CHR, CHR, CHR, CHR, NUL, NUL,
			PUP, HME, PDN, END, PUP, HME, PDN, END,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			ALT, SEL, CLK, DSP, CTL, SEL, CLK, DSP };
			
	// Helper for drawing -- maps out metakeys matched high
	// and low -- this one maps those that are low, with high right
	// above
	public static final boolean[] ls_matched_meta = {
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			 true,  true,  true,  true, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			 true,  true,  true,  true, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false,  true,  true,  true, false, false, false, false };
			
	// Helper for drawing -- opposite for above--metakeys
	// that are high, but matched below.
	public static final boolean[] us_matched_meta = {
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false,  true,  true,  true,  true,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false,
			false, false, false, false,  true,  true,  true,  true,
			false, false, false, false, false, false, false, false,
			false, false, false, false, false,  true,  true,  true };

    // The display map--used just to give the user some idea
    // what this chordal combination will do for them. *Not*
    // used in triggering/processing strokes -- see the 
    // SC_Keys.chordal_map_meta and chordal_map_char arrays.
    public static final String[] chordal_map_d = {
			"SPC", "e", "t", "s", "ENT", "E", "T", "S",
			"INS", "BSP", "DEL", "ESC", " ", " ", " ", " ",
			"o", "a", "u", "i", "O", "A", "U", "I",
			"CUP", "CLF", "CDN", "CRT", "CUP", "CLF", "CDN", "CRT",
			"n", "p", "d", "h", "N", "P", "D", "H",
			"'", ";", "_", "/", "\"", ":", "^", "?",
			"l", "w", "v", "m", "L", "W", "V", "M",
			",", "q", ".", "-", "?", "Q", " ", "TAB",
			"f", "g", "c", "r", "F", "G", "C", "R",
			"+", "=", "*", "!", " ", "@", "&", "\\",
			"b", "j", "y", "k", "B", "J", "Y", "K",
			" ", " ", " ", " ", " ", " ", " ", " ",
			"z", "x", "0", "1", "Z", "X", "%", "|",
			"<", "`", "$", " ", ">", "#", "~", " ",
			"6", "7", "8", "9", "(", ")", " ", " ",
			"PUP", "HME", "PDN", "END", "PUP", "HME", "PDN", "END",
			"2", "3", "4", "5", "[", "]", "{", "}",
			"ALT", "SEL", "CLK", "DSP", "CTL", "SEL", "CLK", "DSP" };

	public static boolean isChar(int p) {
		return (chordal_map_meta[p]==CHR); }
		
	public static boolean isNull(int p) {
		return (chordal_map_meta[p]==NUL); }
		
	public static boolean isMeta(int p) {
		return ((chordal_map_meta[p]!=NUL) && (chordal_map_meta[p]!=CHR)); } 
	
}