/* SC_KeyMap_Cyrillic -- the cyrillic character keymap
*/

package javax.microedition.lcdui;

class SC_Keymap_Cyrillic extends SC_Keymap {

	// Map's name (for display)
	String getMapName() {
		return "Кириддица"; }

	// Map's name (short)
	String getMapNameShort() {
		return "абвг"; } 

	// The metakey mapping to the chordal keyboard
	public static final int[] chordal_map_meta = {
			CHR, CHR, CHR, CHR, ENT, CHR, CHR, CHR,
			OK,  BSP, DEL, ESC, NUL, NUL, NUL, NUL,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CUP, CLF, CDN, CRT, PUP, HME, PDN, END,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, SWM, TAB,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, SLK, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			GRV, ACU, CED, TIL, DIA, RIN, CIR, SYM,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CPY, CHR, CHR, CHR, PST,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			CHR, CHR, CHR, CHR, CHR, CHR, CHR, CHR,
			NUL, SEL, CLK, DSP, NUL, SEL, CLK, DSP };

  // The map of non-meta characters. Note that where there are 
  // valid meta characters, space is set, but these are just 
  // placeholders (and using space makes the table more legible)
	static final char[] chordal_map_chars = {
		' ', 'а', 'и', 'о', ' ', 'А', 'И', 'О',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'е', 'ё', 'н', 'т', 'Е', 'Ё', 'Н', 'Т',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'р', 'с', 'в', 'л', 'Р', 'С', 'В', 'Л',
		'\'', ';', '_', '/', '"', ':', '^', '?',
		'д', 'п', 'к', 'м', 'Д', 'П', 'К', 'М',
		',', '(', '.', '-', '?', ')', ' ', ' ',
		'з', 'я', 'ъ', 'б', 'З', 'Я', 'Ъ', 'Б',
		'+', '=', '*', '!', ' ', '@', '&', '\\',
		'ч', 'ц', 'щ', 'ш', 'Ч', 'Ц', 'Щ', 'Ш',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'у', 'г', 'ж', 'х', 'У', 'Г', 'Ж', 'Х',
		'<', '`', '$', ' ', '>', '#', '~', ' ',
		'ф', 'й', 'ю', 'ь', 'Ф', 'Й', 'Ю', 'Ь',
		'0', '1', '2', '3', '4', '5', '6', '7',
		'э', 'ы', '8', '9', 'Э', 'Ы', '%', '|',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

  // The map of non-meta characters, w/ caps lock
  // selected. Same as above otherwise
	static final char[] chordal_map_chars_caps_lock = {
		' ', 'А', 'И', 'О', ' ', 'а', 'и', 'о',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'Е', 'Ё', 'Н', 'Т', 'е', 'ё', 'н', 'т',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'Р', 'С', 'В', 'Л', 'р', 'с', 'в', 'л',
		'\'', ';', '_', '/', '"', ':', '^', '?',
		'Д', 'П', 'К', 'М', 'д', 'п', 'к', 'м',
		',', '(', '.', '-', '?', ')', ' ', ' ',
		'З', 'Я', 'Ъ', 'Б', 'з', 'я', 'ъ', 'б',
		'+', '=', '*', '!', ' ', '@', '&', '\\',
		'Ч', 'Ц', 'Щ', 'Ш', 'ч', 'ц', 'щ', 'ш',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',
		'У', 'Г', 'Ж', 'Х', 'у', 'г', 'ж', 'х',
		'<', '`', '$', ' ', '>', '#', '~', ' ',
		'Ф', 'Й', 'Ю', 'Ь', 'ф', 'й', 'ю', 'ь',
		'0', '1', '2', '3', '4', '5', '6', '7',
		'Э', 'Ы', '8', '9', 'э', 'ы', '%', '|',
		' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
			
  // Map of upper-case/lower-case/non-case sensitive chars
	static final int[] chordal_map_case = {
		NCS, LCS, LCS, LCS, NCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, LCS, LCS, UCS, UCS, UCS, UCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS,
		LCS, LCS, NCS, NCS, UCS, UCS, NCS, NCS,
		NCS, NCS, NCS, NCS, NCS, NCS, NCS, NCS };

    // The display map--used just to give the user some idea
    // what this chordal combination will do for them. *Not*
    // used in triggering/processing strokes -- see the 
    // chordal_map_meta and chordal_map_char arrays.
    public static final String[] chordal_map_d = {
			SPCG, "а", "и", "о", ENTG, "А", "И", "О",
			OKST, BSPG, DELG, ESCS, " ", " ", " ", " ",
			"е", "ё", "н", "т", "Е", "Ё", "Н", "Т",
			U_ARR, L_ARR, D_ARR, R_ARR, U_DAR, L_DAR, D_DAR, R_DAR,
			"р", "с", "в", "л", "Р", "С", "В", "Л",
			"'", ";", "_", "/", "\"", ":", "^", "?",
			"д", "п", "к", "м", "Д", "П", "К", "М",
			",", "(", ".", "-", "?", ")", SWMS, TABG,
			"з", "я", "ъ", "б", "З", "Я", "Ъ", "Б",
			"+", "=", "*", "!", SLKS, "@", "&", "\\",
			"ч", "ц", "щ", "ш", "Ч", "Ц", "Щ", "Ш",
			XGRV, XACU, XCED, XTIL, XDIA, XRIN, XCIR, SYMS,
			"у", "г", "ж", "х", "У", "Г", "Ж", "Х",
			"<", "`", "$", CPYG, ">", "#", "~", PSTG,
			"ф", "й", "ю", "ь", "Ф", "Й", "Ю", "Ь",
			"0", "1", "2", "3", "4", "5", "6", "7",
			"э", "ы", "8", "9", "Э", "Ы", "%", "|",
			" ", SELG, CLKG, DSPG, " ", SELG, CLKG, DSPG };

   public static final String[] chordal_map_d_caps_lock = {
			SPCG, "А", "И", "О", ENTG, "а", "и", "о",
			OKST, BSPG, DELG, ESCS, " ", " ", " ", " ",
			"Е", "Ё", "Н", "Т", "е", "ё", "н", "т",
			U_ARR, L_ARR, D_ARR, R_ARR, U_DAR, L_DAR, D_DAR, R_DAR,
			"Р", "С", "В", "Л", "р", "с", "в", "л",
			"'", ";", "_", "/", "\"", ":", "^", "?",
			"Д", "П", "К", "М", "д", "п", "к", "м",
			",", "(", ".", "-", "?", ")", SWMS, TABG,
			"З", "Я", "Ъ", "Б", "з", "я", "ъ", "б",
			"+", "=", "*", "!", SLKS, "@", "&", "\\",
			"Ч", "Ц", "Щ", "Ш", "ч", "ц", "щ", "ш",
			XGRV, XACU, XCED, XTIL, XDIA, XRIN, XCIR, SYMS,
			"У", "Г", "Ж", "Х", "у", "г", "ж", "х",
			"<", "`", "$", CPYG, ">", "#", "~", PSTG,
			"Ф", "Й", "Ю", "Ь", "ф", "й", "ю", "ь",
			"0", "1", "2", "3", "4", "5", "6", "7",
			"Э", "Ы", "8", "9", "э", "ы", "%", "|",
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
}
