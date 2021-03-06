/* SC_KeyMap_NumericSymbolic_Roman -- keymap for dedicated numeric entry,
	common symbols and diacritics, extended Latin set characters--typically
	used from the symbols shift and lock keys in the Roman main board)
*/

package javax.microedition.lcdui;

class SC_Keymap_NumericSymbolic_Roman extends SC_Keymap {

	// Map's name (for display)
	public String getMapName() {
		return "Roman sym/num"; }
		
	// Map's name (short)
	String getMapNameShort() {
		return "§Þ±¿"; } 

		// Note: Currencies supported in symbol board
		// but written as Unicode escapes in UTF-16 source:

		// 20a8 = Rupee (India)
		// 20b0 = German penny
		
		// Note: Escaped typographic symbols:

		// 2023 = triangular bullet
		// 2052 = commercial minus sign
		// 2053 = swung dash
		// 203b = reference mark
		
		// Note: Escaped Latin extension characters (board supports
		// those for which diacritics deadkeys cannot be used)

		// 01a2 Latin capital oi (pan-Turkic Latin)
		// 01a3 Latin small oi
		// 01a6 Latin yr (Old Norse)
		// 0192 Latin capital ezh
		// 0292 Latin small ezh
		// 01a9 Latin capital esh
		// 0283 Latin small esh
		// 01f7 Latin capital wynn
		// 01bf Latin small wynn
		// 021c Latin capital yogh
		// 021d Latin small yogh
		// 0245 Latin capital turned V
		// 028c Latin small turned v
		// 01b1 Latin capital upsilon
		// 028a Latin small upsilon
		
    public static final String[] chordal_map_d = {
			SPCG, "0", "1", "2", ENTG, "[", "]", "µ", // 0-7
			" ", BSPG, DELG, CNCS, " ", " ", " ", " ", // 8-15
			"3", "4", "5", "6", "{", "}", "×", "÷", // 16-23
			U_ARR, L_ARR, D_ARR, R_ARR, U_DAR, L_DAR, D_DAR, R_DAR, // 24-31
			"7", "8", "9", "±", "¢", "£", "¤", "¥",
			"₨", " ", "₰", " ", "€", "₫", "₪", " ",
			"þ", "ð", "ø", "ß", "Þ", "Ð", "Ø", "ĸ",
			"§", "©", "®",  "⁒", "ª", "º", "¡", "¿",
			"ŋ", "ƣ", "ʒ", "ſ", "Ŋ", "Ƣ", "ƒ", "Ʀ",
			"¬", "—", "–", "¶", "⁓", " ", "†", "‡",
			XGRV, XACU, XCED, XTIL, XDIA, XRIN, XCIR, CNCS,
			XCAR, XMCR, XBRV, XSTR, XOGO, XUDT, XMDT, XLIG,
			"‘", "’", "“", "”", "‹", "›", "«", "»",
			"―", "⁒", "•", CPYG, " ", " ", " ", PSTG,
			"Ʃ", "ƿ", " ", "ȝ", "ʃ", "Ƿ", " ", "Ȝ",
			" ", " ", "ʌ", "ʊ", " ", " ", "Ʌ", "Ʊ",
			" ", " ", " ", " ", " ", " ", " ", " ",
			" ", SELG, CLKG, DSPG, " ", SELG, CLKG, DSPG };

	// The metakey mapping to the chordal keyboard
	public static final int[] chordal_map_meta = {
			CHR, CHR, CHR, CHR, ENT, CHR, CHR, CHR,
			NUL, BSP, DEL, CNC, NUL, NUL, NUL, NUL,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CUP, CLF, CDN, CRT, PUP, HME, PDN, END,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, NUL, NUL, CHR, CHR, CHR, NUL,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, NUL, CHR, CHR,
			GRV, ACU, CED, TIL, DIA, RIN, CIR, CNC,
			CAR, MCR, BRV, STR, OGO, UDT, MDT, LIG,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CPY, NUL, NUL, NUL, PST,
			CHR, CHR, NUL, CHR, CHR, CHR, NUL, CHR,
			NUL, NUL, CHR, CHR, NUL, NUL, CHR, CHR,
			NUL, NUL, NUL, NUL, NUL, NUL, NUL, NUL,
			NUL, SEL, CLK, DSP, NUL, SEL, CLK, DSP };

  // The map of non-meta characters. Note that where there are 
  // valid meta characters, space is set, but these are just 
  // placeholders (and using space makes the table more legible)
	static final char[] chordal_map_chars = {
		' ', '0', '1', '2', ' ', '[', ']', 'µ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'3', '4', '5', '6', '{', '}', '×', '÷',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'7', '8', '9', '±', '¢', '£', '¤', '¥',
		'₨', ' ', '₰', ' ', '€', '₫', '₪', ' ',
		'þ', 'ð', 'ø', 'ß', 'Þ', 'Ð', 'Ø', 'ĸ',
		'§', '©', '®',  '⁒', 'ª', 'º', '¡', '¿',
		'ŋ', 'ƣ', 'ʒ', 'ſ', 'Ŋ', 'Ƣ', 'ƒ', 'Ʀ',
		'¬', '—', '–', '¶', '⁓', ' ', '†', '‡',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'‘', '’', '“', '”', '‹', '›', '«', '»',
		'―', '⁒', '•', ' ', ' ', ' ', ' ', ' ',
		'Ʃ', 'ƿ', ' ', 'ȝ', 'ʃ', 'Ƿ', ' ', 'Ȝ',
		' ', ' ', 'ʌ', 'ʊ', ' ', ' ', 'Ʌ', 'Ʊ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', };

  // The map of non-meta characters, w/ caps lock
  // selected. Same as above otherwise
	static final char[] chordal_map_chars_caps_lock = {
		' ', '0', '1', '2', ' ', '[', ']', 'µ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'3', '4', '5', '6', '{', '}', '×', '÷',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'7', '8', '9', '±', '¢', '£', '¤', '¥',
		'₨', ' ', '₰', ' ', '€', '₫', '₪', ' ',
		'Þ', 'Ð', 'Ø', 'ß', 'þ', 'ð', 'ø', 'ĸ',
		'§', '©', '®',  '⁒', 'ª', 'º', '¡', '¿',
		'Ŋ', 'Ƣ', 'ƒ', 'ſ', 'ŋ', 'ƣ', 'ʒ', 'Ʀ',
		'¬', '—', '–', '¶', '⁓', ' ', '†', '‡',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'‘', '’', '“', '”', '‹', '›', '«', '»',
		'―', '⁒', '•', ' ', ' ', ' ', ' ', ' ',
		'ʃ', 'Ƿ', ' ', 'Ȝ', 'Ʃ', 'ƿ', ' ', 'ȝ',
		' ', ' ', 'Ʌ', 'Ʊ', ' ', ' ', 'ʌ', 'ʊ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

  // Map of upper-case/lower-case/non-case sensitive chars
	static final int[] chordal_map_case = {
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, NCS, UCS, UCS, UCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, NCS, UCS, UCS, UCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, NCS, LCS, UCS, UCS, NCS, UCS,
		NCS, NCS, LCS, LCS, NCS, NCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS };

   public static final String[] chordal_map_d_caps_lock = {
			SPCG, "0", "1", "2", ENTG, "[", "]", "µ",
			" ", BSPG, DELG, CNCS, " ", " ", " ", " ",
			"3", "4", "5", "6", "{", "}", "×", "÷",
			U_ARR, L_ARR, D_ARR, R_ARR, U_DAR, L_DAR, D_DAR, R_DAR,
			"7", "8", "9", "±", "¢", "£", "¤", "¥",
			"₨", " ", "₰", " ", "€", "₫", "₪", " ",
			"Þ", "Ð", "Ø", "ß", "þ", "ð", "ø", "ĸ",
			"§", "©", "®",  "⁒", "ª", "º", "¡", "¿",
			"Ŋ", "Ƣ", "ƒ", "ſ", "ŋ", "ƣ", "ʒ", "Ʀ",
			"¬", "—", "–", "¶", "⁓", " ", "†", "‡",
			XGRV, XACU, XCED, XTIL, XDIA, XRIN, XCIR, CNCS,
			XCAR, XMCR, XBRV, XSTR, XOGO, XUDT, XMDT, XLIG,
			"‘", "’", "“", "”", "‹", "›", "«", "»",
			"―", "⁒", "•", CPYG, " ", " ", " ", PSTG,
			"ʃ", "Ƿ", " ", "Ȝ", "Ʃ", "ƿ", " ", "ȝ",
			" ", " ", "Ʌ", "Ʊ", " ", " ", "ʌ", "ʊ",
			" ", " ", " ", " ", " ", " ", " ", " ",
			" ", SELG, CLKG, DSPG, " ", SELG, CLKG, DSPG };

	// Get the character at a given position
	char getOutputChar(boolean caps_lock, int offset) {
		return (caps_lock ?
			chordal_map_chars_caps_lock[offset] :
			chordal_map_chars[offset]); }

	// Is the character at this offset lowercase alpha?
	boolean isLCAlpha(boolean caps_lock, int offset) {
		int case_ind = chordal_map_case[offset];
		if (case_ind == NCS) {
			return false; }
		boolean r = (case_ind == LCS);
		if (caps_lock) {
			r = !r; }
		return r; }

	// Is the character at this offset uppercase alpha?
	boolean isUCAlpha(boolean caps_lock, int offset) {
		int case_ind = chordal_map_case[offset];
		if (case_ind == NCS) {
			return false; }
		boolean r = (case_ind == UCS);
		if (caps_lock) {
			r = !r; }
		return r; }

	// Get the metakey at a given position (may be CHR, or NUL)
	int getMetaKey(int offset) {
		return chordal_map_meta[offset]; }
		
	// Get the display string at this location
	String getDisplayString(boolean caps_lock, int offset) {
		return (caps_lock ? 
			chordal_map_d_caps_lock[offset] :
			chordal_map_d[offset]); }
			
	// Is there a character at this position?
	boolean isChar(int p) {
		return (chordal_map_meta[p]==CHR); }

	// Is there a null at this position?
	boolean isNull(int p) {
		return (chordal_map_meta[p]==NUL); }
	
	// Is there a metakey at this position?
	boolean isMeta(int p) {
		return ((chordal_map_meta[p]!=NUL) && (chordal_map_meta[p]!=CHR)); }
		
	// Does this keystroke cancel a transient map?
	boolean cancelsTransient(int o) {
		if (isChar(o)) { 
			return true; }
		if (isNull(o)) {
			return false; }
		int m = getMetaKey(o);
		switch(m) {
			case CUP:
			case CLF:
			case CDN:
			case CRT:
			case PUP:
			case HME:
			case PDN:
			case END:
			case SEL:
			case CLK:
			case DSP:
			return false;
		default:
			return true; } }
}
