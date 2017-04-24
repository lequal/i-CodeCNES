/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/*****************************************************************************/
/* This file is used to generate a rule checker for F90.DATA.ArrayAccess rule*/
/* For further information on this, we advise you to refer to RNC manuals.	 */
/* As many comments have been done on the ExampleRule.lex file, this file    */
/* will restrain its comments on modifications.								 */
/*																			 */
/*****************************************************************************/

package fr.cnes.analysis.tools.fortran90.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;

import java.util.List;

import org.eclipse.core.runtime.IPath;




import fr.cnes.analysis.tools.analyzer.exception.JFlexException;
import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;
import fr.cnes.analysis.tools.analyzer.datas.Violation;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/F90DATAArrayAccess.lex</tt>
 */
public class F90DATAArrayAccess extends AbstractRule {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int NAMING = 4;
  public static final int NEW_LINE = 6;
  public static final int LINE = 8;
  public static final int ARRAY = 10;
  public static final int INDIRECTION = 12;
  public static final int ARRAY_PARAM = 14;
  public static final int ARRAY_DEC = 16;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8, 8
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\36\1\37\1\40\1\41\1\40\22\0\1\24\1\1\1\35"+
    "\2\0\1\45\1\43\1\34\1\23\1\44\5\0\1\26\12\33\1\42"+
    "\2\0\1\25\3\0\1\20\1\16\1\5\1\14\1\13\1\2\1\17"+
    "\1\27\1\30\2\27\1\22\1\21\1\4\1\10\1\11\1\27\1\12"+
    "\1\31\1\6\1\3\5\27\4\0\1\32\1\0\1\20\1\16\1\5"+
    "\1\14\1\13\1\2\1\17\1\27\1\30\2\27\1\22\1\21\1\4"+
    "\1\10\1\11\1\27\1\12\1\31\1\6\1\3\5\27\12\0\1\40"+
    "\252\0\2\7\115\0\1\15\u1ea8\0\1\40\1\40\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\11\0\1\1\1\2\7\1\1\3\1\4\1\5\1\6"+
    "\1\7\7\1\13\5\1\10\1\11\1\12\1\13\1\5"+
    "\1\13\1\14\1\5\1\15\1\16\11\0\1\17\11\0"+
    "\1\20\2\0\1\21\1\22\27\0\1\23\7\0\1\24"+
    "\23\0\1\25\5\0\1\25\22\0\1\26\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214"+
    "\0\u023a\0\u0260\0\u0156\0\u0156\0\u0156\0\u0286\0\u0156\0\u02ac"+
    "\0\u02d2\0\u02f8\0\u031e\0\u0344\0\u036a\0\u0390\0\u02ac\0\u02d2"+
    "\0\u01a2\0\u02f8\0\u031e\0\u01ee\0\u0344\0\u036a\0\u0390\0\u023a"+
    "\0\u0260\0\u03b6\0\u0156\0\u0156\0\u03dc\0\u0402\0\u0428\0\u0156"+
    "\0\u044e\0\u0156\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532"+
    "\0\u023a\0\u0260\0\u02d2\0\u0558\0\u0156\0\u057e\0\u05a4\0\u05ca"+
    "\0\u05f0\0\u0616\0\u063c\0\u0662\0\u0688\0\u06ae\0\u0156\0\u06d4"+
    "\0\u0402\0\u0156\0\u0156\0\u06fa\0\u0720\0\u0746\0\u076c\0\u0792"+
    "\0\u07b8\0\u07de\0\u0804\0\u082a\0\u0850\0\u0876\0\u089c\0\u08c2"+
    "\0\u08e8\0\u090e\0\u0934\0\u095a\0\u0980\0\u09a6\0\u09cc\0\u09f2"+
    "\0\u0a18\0\u0a3e\0\u0156\0\u0a64\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc"+
    "\0\u0b22\0\u0b48\0\u0156\0\u0b6e\0\u0b94\0\u0bba\0\u0be0\0\u0c06"+
    "\0\u0c2c\0\u0c52\0\u0c78\0\u0c9e\0\u0cc4\0\u0cea\0\u0d10\0\u0d36"+
    "\0\u0d5c\0\u0d82\0\u0da8\0\u0dce\0\u0df4\0\u0e1a\0\u0156\0\u0e40"+
    "\0\u0e66\0\u0e8c\0\u0eb2\0\u0ed8\0\u02d2\0\u0efe\0\u0f24\0\u0f4a"+
    "\0\u0f70\0\u0f96\0\u0fbc\0\u0fe2\0\u1008\0\u102e\0\u1054\0\u107a"+
    "\0\u10a0\0\u10c6\0\u10ec\0\u1112\0\u1138\0\u115e\0\u1184\0\u0156"+
    "\0\u11aa";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\12\1\13\1\14\4\12\1\15\1\12\1\16\3\12"+
    "\1\17\3\12\1\20\6\12\1\15\1\17\2\12\1\21"+
    "\1\22\1\12\1\23\2\24\4\12\1\25\1\13\35\25"+
    "\1\23\2\24\5\25\1\13\5\26\1\25\5\26\1\25"+
    "\5\26\4\25\3\26\5\25\1\27\2\24\4\25\1\12"+
    "\1\13\1\30\4\31\1\15\1\31\1\32\2\31\1\33"+
    "\1\17\3\31\1\34\1\31\4\12\1\31\1\35\1\36"+
    "\2\12\1\21\1\22\1\12\1\25\2\24\4\12\1\25"+
    "\1\13\1\37\4\40\1\41\1\40\1\42\2\40\1\43"+
    "\1\44\3\40\1\45\1\40\4\25\1\40\1\46\1\47"+
    "\2\25\1\50\1\51\1\25\1\23\2\24\5\25\1\13"+
    "\5\52\1\25\5\52\1\25\5\52\1\53\3\25\3\52"+
    "\5\25\1\23\2\24\2\25\1\54\2\25\1\13\5\55"+
    "\1\25\5\55\1\25\5\55\3\25\1\56\3\55\1\25"+
    "\1\57\13\25\1\13\35\25\1\60\2\24\1\61\1\62"+
    "\3\25\1\13\5\63\1\25\5\63\1\25\5\63\4\25"+
    "\3\63\5\25\1\60\2\24\1\25\1\62\2\25\51\0"+
    "\1\64\46\0\1\65\53\0\1\66\36\0\1\67\52\0"+
    "\1\70\35\0\34\71\1\12\11\71\35\72\1\12\10\72"+
    "\2\0\5\26\1\0\5\26\1\0\5\26\4\0\5\26"+
    "\14\0\1\73\1\74\3\73\1\0\5\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\6\0\5\73\1\0\5\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\5\73\2\0\1\100\2\0\1\100"+
    "\6\0\5\73\1\0\2\73\1\101\2\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\6\0\5\73\1\102\5\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\1\73\1\103\3\73\2\0\1\100"+
    "\2\0\1\100\6\0\5\73\1\0\1\104\4\73\1\0"+
    "\5\73\1\75\1\76\1\77\1\0\5\73\2\0\1\100"+
    "\2\0\1\100\6\0\2\73\1\105\2\73\1\0\5\73"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\1\73\1\106\3\73\1\0"+
    "\5\73\1\0\5\73\1\75\1\76\1\77\1\0\5\73"+
    "\2\0\1\100\2\0\1\100\6\0\5\52\1\0\5\52"+
    "\1\0\5\52\1\107\1\110\2\0\5\52\11\0\1\25"+
    "\2\0\5\55\1\0\5\55\1\0\5\55\4\0\5\55"+
    "\36\0\1\111\17\0\1\112\34\0\1\57\54\0\1\113"+
    "\5\0\5\63\1\0\5\63\1\0\5\63\1\0\1\114"+
    "\1\115\1\0\5\63\2\0\1\114\2\0\1\114\10\0"+
    "\1\116\47\0\1\117\47\0\1\120\53\0\1\121\43\0"+
    "\1\122\33\0\2\73\1\123\2\73\1\0\5\73\1\0"+
    "\5\73\1\75\1\76\1\77\1\0\5\73\2\0\1\100"+
    "\2\0\1\100\27\0\1\75\1\76\1\77\10\0\1\100"+
    "\2\0\1\100\27\0\1\124\1\77\11\0\1\77\2\0"+
    "\1\77\30\0\1\100\1\77\10\0\1\100\2\0\1\100"+
    "\6\0\5\73\1\0\1\125\4\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\5\73\2\0\1\100\2\0\1\100"+
    "\25\0\1\126\26\0\5\73\1\0\5\73\1\0\3\73"+
    "\1\127\1\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\5\73\1\0\4\73\1\130"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\4\73\1\131\1\0\5\73"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\5\73\1\0\5\73\1\0"+
    "\1\132\4\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\27\0\1\107\1\110\20\0\1\25"+
    "\24\0\1\114\1\115\10\0\1\114\2\0\1\114\27\0"+
    "\1\133\1\115\11\0\1\115\2\0\1\115\11\0\1\134"+
    "\53\0\1\135\37\0\1\136\11\0\1\137\40\0\1\140"+
    "\36\0\1\141\44\0\3\73\1\142\1\73\1\0\5\73"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\32\0\1\143\21\0\3\73\1\144"+
    "\1\73\1\0\5\73\1\0\1\73\1\145\3\73\1\75"+
    "\1\76\1\77\1\0\5\73\2\0\1\100\2\0\1\100"+
    "\17\0\1\146\34\0\5\73\1\0\3\73\1\147\1\73"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\1\73\1\150\3\73\1\0"+
    "\5\73\1\0\5\73\1\75\1\76\1\77\1\0\5\73"+
    "\2\0\1\100\2\0\1\100\6\0\5\73\1\0\3\73"+
    "\1\151\1\73\1\0\5\73\1\75\1\76\1\77\1\0"+
    "\5\73\2\0\1\100\2\0\1\100\6\0\5\73\1\0"+
    "\2\73\1\152\2\73\1\0\5\73\1\75\1\76\1\77"+
    "\1\0\5\73\2\0\1\100\2\0\1\100\32\0\1\153"+
    "\25\0\1\154\51\0\1\155\46\0\1\156\44\0\1\157"+
    "\43\0\1\160\57\0\1\161\25\0\4\73\1\162\1\0"+
    "\5\73\1\0\5\73\1\75\1\76\1\77\1\0\5\73"+
    "\2\0\1\100\2\0\1\100\6\0\5\73\1\0\3\73"+
    "\1\163\1\73\1\0\5\73\1\75\1\76\1\77\1\0"+
    "\5\73\2\0\1\100\2\0\1\100\6\0\5\73\1\0"+
    "\2\73\1\164\2\73\1\0\5\73\1\75\1\76\1\77"+
    "\1\0\5\73\2\0\1\100\2\0\1\100\10\0\1\165"+
    "\43\0\2\73\1\166\2\73\1\0\5\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\6\0\5\73\1\0\5\73\1\0\4\73\1\167"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\6\0\5\73\1\0\2\73\1\170\2\73\1\0"+
    "\5\73\1\75\1\76\1\77\1\0\5\73\2\0\1\100"+
    "\2\0\1\100\6\0\5\73\1\0\1\171\4\73\1\0"+
    "\5\73\1\75\1\76\1\77\1\0\5\73\2\0\1\100"+
    "\2\0\1\100\13\0\1\172\20\0\1\172\17\0\1\173"+
    "\57\0\1\174\51\0\1\175\30\0\1\176\55\0\1\177"+
    "\34\0\5\73\1\172\5\73\1\0\5\73\1\75\1\76"+
    "\1\77\1\0\1\73\1\200\3\73\2\0\1\100\2\0"+
    "\1\100\6\0\5\73\1\0\4\73\1\201\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\6\0\5\73\1\0\5\73\1\0\2\73\1\202"+
    "\2\73\1\75\1\76\1\77\1\0\5\73\2\0\1\100"+
    "\2\0\1\100\21\0\1\203\13\0\1\203\16\0\5\73"+
    "\1\0\5\73\1\203\5\73\1\75\1\76\1\77\1\0"+
    "\2\73\1\204\2\73\2\0\1\100\2\0\1\100\6\0"+
    "\5\73\1\0\3\73\1\205\1\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\5\73\2\0\1\100\2\0\1\100"+
    "\6\0\1\206\4\73\1\0\5\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\5\73\2\0\1\100\2\0\1\100"+
    "\6\0\1\73\1\207\3\73\1\0\5\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\14\0\1\210\55\0\1\211\30\0\1\212\63\0"+
    "\1\177\32\0\1\213\41\0\5\73\1\0\1\214\4\73"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\1\73\1\215\3\73\1\0"+
    "\5\73\1\0\5\73\1\75\1\76\1\77\1\0\5\73"+
    "\2\0\1\100\2\0\1\100\6\0\5\73\1\0\5\73"+
    "\1\0\3\73\1\205\1\73\1\75\1\76\1\77\1\0"+
    "\5\73\2\0\1\100\2\0\1\100\13\0\1\216\20\0"+
    "\1\216\17\0\5\73\1\216\5\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\1\73\1\217\3\73\2\0\1\100"+
    "\2\0\1\100\6\0\5\73\1\0\5\73\1\0\2\73"+
    "\1\220\2\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\6\0\4\73\1\221\1\0\5\73"+
    "\1\0\5\73\1\75\1\76\1\77\1\0\5\73\2\0"+
    "\1\100\2\0\1\100\10\0\1\177\46\0\1\161\52\0"+
    "\1\161\42\0\1\222\20\0\1\222\17\0\2\73\1\205"+
    "\2\73\1\0\5\73\1\0\5\73\1\75\1\76\1\77"+
    "\1\0\5\73\2\0\1\100\2\0\1\100\6\0\5\73"+
    "\1\0\2\73\1\167\2\73\1\0\5\73\1\75\1\76"+
    "\1\77\1\0\5\73\2\0\1\100\2\0\1\100\14\0"+
    "\1\223\37\0\5\73\1\0\1\224\4\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\6\0\3\73\1\167\1\73\1\0\5\73\1\0"+
    "\5\73\1\75\1\76\1\77\1\0\5\73\2\0\1\100"+
    "\2\0\1\100\6\0\5\73\1\222\5\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\1\73\1\225\3\73\2\0"+
    "\1\100\2\0\1\100\10\0\1\161\45\0\1\226\43\0"+
    "\2\73\1\227\2\73\1\0\5\73\1\0\5\73\1\75"+
    "\1\76\1\77\1\0\5\73\2\0\1\100\2\0\1\100"+
    "\6\0\2\73\1\167\2\73\1\0\5\73\1\0\5\73"+
    "\1\75\1\76\1\77\1\0\5\73\2\0\1\100\2\0"+
    "\1\100\27\0\1\230\1\226\11\0\1\226\2\0\1\226"+
    "\6\0\5\73\1\0\5\73\1\0\5\73\1\230\1\231"+
    "\1\77\1\0\5\73\2\0\1\231\2\0\1\231\27\0"+
    "\1\230\1\231\1\77\10\0\1\231\2\0\1\231\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4560];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\11\0\2\11\7\1\3\11\1\1\1\11\23\1\2\11"+
    "\3\1\1\11\1\1\1\11\1\1\11\0\1\11\11\0"+
    "\1\11\2\0\2\11\27\0\1\11\7\0\1\11\23\0"+
    "\1\11\5\0\1\1\22\0\1\11\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[153];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	String location = "MAIN PROGRAM"; 
 	List<Violation> list = new LinkedList<Violation>();
 	/** Arrays declared in the file **/
 	List<String> arrays = new LinkedList<String>();
 	List<String> arraysInd = new LinkedList<String>();
 	/** Parameters to make checkings **/
	int par = 0;
	boolean end = true;
	String array = "";
	boolean indirectionRep = false;
	List<String> indirect = new LinkedList<String>();
	
	public F90DATAArrayAccess() {
    }
	
	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
		this.zzReader = new FileReader(file.toOSString());
	}
	
	


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public F90DATAArrayAccess(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public List<Violation> run() throws java.io.IOException, JFlexException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          {   
 return getViolations(); 
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(LINE);
            }
          case 23: break;
          case 2: 
            { yybegin(COMMENT);
            }
          case 24: break;
          case 3: 
            { yybegin(NEW_LINE);
            }
          case 25: break;
          case 4: 
            { throw new JFlexException( new Exception("Illegal character <" + yytext() + ">") );
            }
          case 26: break;
          case 5: 
            { 
            }
          case 27: break;
          case 6: 
            { location = location + " " + yytext(); arrays.clear(); yybegin(COMMENT);
            }
          case 28: break;
          case 7: 
            { arrays.clear(); yybegin(NEW_LINE);
            }
          case 29: break;
          case 8: 
            { if(arraysInd.contains(yytext().toLowerCase())) setError(location,"Array " + array + 
																		" initialized using other array named "
																		+ yytext() + " with repeated values.", yyline+1);
 								 else yybegin(LINE);
            }
          case 30: break;
          case 9: 
            { par++;
            }
          case 31: break;
          case 10: 
            { par--; if(par==0) yybegin(LINE);
            }
          case 32: break;
          case 11: 
            { if(!indirectionRep) {
										String val = yytext();
									 	if(indirect.contains(val)) indirectionRep = true;
									 	else indirect.add(val);
									 }
            }
          case 33: break;
          case 12: 
            { if(end) yybegin(NEW_LINE);
								 end=true;
            }
          case 34: break;
          case 13: 
            { end=false;
            }
          case 35: break;
          case 14: 
            { arrays.add(yytext());
            }
          case 36: break;
          case 15: 
            { array = yytext().toLowerCase().substring(0, yytext().length()-1).trim();
								 if(arrays.contains(array)) {par=1; yybegin(ARRAY);}
            }
          case 37: break;
          case 16: 
            { String var = yytext().toLowerCase().substring(0, yytext().length()-1).trim();
								 if(arrays.contains(var)) { array=var;par=1; }
 								 else yybegin(LINE);
            }
          case 38: break;
          case 17: 
            { if(indirectionRep) arraysInd.add(array);
									 indirect.clear();
									 yybegin(LINE);
            }
          case 39: break;
          case 18: 
            { yybegin(ARRAY_DEC);
            }
          case 40: break;
          case 19: 
            { array = yytext().replaceAll("\\(","").replaceAll("=","").replaceAll("/","").trim(); 
								 indirectionRep=false; yybegin(INDIRECTION);
            }
          case 41: break;
          case 20: 
            { array = yytext().replaceAll("\\(","").replaceAll("=","").replaceAll("/","").trim(); 
								 arrays.add(array); indirectionRep=false; yybegin(INDIRECTION);
            }
          case 42: break;
          case 21: 
            { location = yytext(); yybegin(NAMING);
            }
          case 43: break;
          case 22: 
            { yybegin(ARRAY_PARAM);
            }
          case 44: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}