//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.mycompany.app_practica_1.Parser;

import com.mycompany.app_practica_1.Lexer.sym;
import com.mycompany.app_practica_1.Lexer.appLexer;
import com.mycompany.app_practica_1.Instructions.Settings;
import com.mycompany.app_practica_1.Instructions.*;
import java_cup.runtime.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser implements Serializable {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\027\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\006\015\000\002\006\015\000\002\006\017" +
    "\000\002\006\017\000\002\006\021\000\002\006\003\000" +
    "\002\004\015\000\002\004\003\000\002\003\003\000\002" +
    "\003\002\000\002\005\003\000\002\005\003\000\002\007" +
    "\005\000\002\007\005\000\002\007\003\000\002\010\005" +
    "\000\002\010\005\000\002\010\003\000\002\011\003\000" +
    "\002\011\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\143\000\006\003\004\005\005\001\002\000\004\002" +
    "\uffff\001\002\000\016\003\014\013\010\014\015\015\012" +
    "\016\011\017\016\001\002\000\004\002\007\001\002\000" +
    "\004\002\000\001\002\000\004\026\134\001\002\000\004" +
    "\026\120\001\002\000\004\026\104\001\002\000\004\002" +
    "\001\001\002\000\004\002\ufff9\001\002\000\004\026\072" +
    "\001\002\000\004\026\017\001\002\000\010\003\022\020" +
    "\025\026\020\001\002\000\006\020\025\026\020\001\002" +
    "\000\004\021\037\001\002\000\004\021\ufff3\001\002\000" +
    "\016\021\ufff0\022\ufff0\023\ufff0\024\033\025\032\027\ufff0" +
    "\001\002\000\016\021\uffed\022\uffed\023\uffed\024\uffed\025" +
    "\uffed\027\uffed\001\002\000\016\021\uffec\022\uffec\023\uffec" +
    "\024\uffec\025\uffec\027\uffec\001\002\000\010\021\ufff4\022" +
    "\030\023\027\001\002\000\006\020\025\026\020\001\002" +
    "\000\006\020\025\026\020\001\002\000\016\021\ufff2\022" +
    "\ufff2\023\ufff2\024\033\025\032\027\ufff2\001\002\000\006" +
    "\020\025\026\020\001\002\000\006\020\025\026\020\001" +
    "\002\000\016\021\uffef\022\uffef\023\uffef\024\uffef\025\uffef" +
    "\027\uffef\001\002\000\016\021\uffee\022\uffee\023\uffee\024" +
    "\uffee\025\uffee\027\uffee\001\002\000\016\021\ufff1\022\ufff1" +
    "\023\ufff1\024\033\025\032\027\ufff1\001\002\000\010\003" +
    "\022\020\025\026\020\001\002\000\004\021\041\001\002" +
    "\000\010\003\022\020\025\026\020\001\002\000\004\021" +
    "\043\001\002\000\010\003\022\020\025\026\020\001\002" +
    "\000\004\021\045\001\002\000\010\003\022\020\025\026" +
    "\020\001\002\000\004\021\047\001\002\000\004\011\050" +
    "\001\002\000\004\027\051\001\002\000\012\002\ufff5\003" +
    "\004\005\005\006\052\001\002\000\004\007\056\001\002" +
    "\000\004\002\ufff7\001\002\000\004\002\ufff6\001\002\000" +
    "\004\002\ufffa\001\002\000\004\010\057\001\002\000\004" +
    "\026\060\001\002\000\010\003\022\020\025\026\020\001" +
    "\002\000\004\021\062\001\002\000\010\003\022\020\025" +
    "\026\020\001\002\000\004\021\064\001\002\000\004\012" +
    "\065\001\002\000\004\027\066\001\002\000\010\002\ufff5" +
    "\003\004\005\005\001\002\000\004\002\ufff8\001\002\000" +
    "\010\022\030\023\027\027\071\001\002\000\016\021\uffeb" +
    "\022\uffeb\023\uffeb\024\uffeb\025\uffeb\027\uffeb\001\002\000" +
    "\010\003\022\020\025\026\020\001\002\000\004\021\074" +
    "\001\002\000\010\003\022\020\025\026\020\001\002\000" +
    "\004\021\076\001\002\000\010\003\022\020\025\026\020" +
    "\001\002\000\004\021\100\001\002\000\004\011\101\001" +
    "\002\000\004\027\102\001\002\000\012\002\ufff5\003\004" +
    "\005\005\006\052\001\002\000\004\002\ufffd\001\002\000" +
    "\010\003\022\020\025\026\020\001\002\000\004\021\106" +
    "\001\002\000\010\003\022\020\025\026\020\001\002\000" +
    "\004\021\110\001\002\000\010\003\022\020\025\026\020" +
    "\001\002\000\004\021\112\001\002\000\010\003\022\020" +
    "\025\026\020\001\002\000\004\021\114\001\002\000\004" +
    "\011\115\001\002\000\004\027\116\001\002\000\012\002" +
    "\ufff5\003\004\005\005\006\052\001\002\000\004\002\ufffc" +
    "\001\002\000\010\003\022\020\025\026\020\001\002\000" +
    "\004\021\122\001\002\000\010\003\022\020\025\026\020" +
    "\001\002\000\004\021\124\001\002\000\010\003\022\020" +
    "\025\026\020\001\002\000\004\021\126\001\002\000\010" +
    "\003\022\020\025\026\020\001\002\000\004\021\130\001" +
    "\002\000\004\011\131\001\002\000\004\027\132\001\002" +
    "\000\012\002\ufff5\003\004\005\005\006\052\001\002\000" +
    "\004\002\ufffb\001\002\000\010\003\022\020\025\026\020" +
    "\001\002\000\004\021\136\001\002\000\010\003\022\020" +
    "\025\026\020\001\002\000\004\021\140\001\002\000\010" +
    "\003\022\020\025\026\020\001\002\000\004\021\142\001" +
    "\002\000\004\011\143\001\002\000\004\027\144\001\002" +
    "\000\012\002\ufff5\003\004\005\005\006\052\001\002\000" +
    "\004\002\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\143\000\004\002\005\001\001\000\002\001\001\000" +
    "\004\006\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\005\020\007\025\010\022\011\023\001" +
    "\001\000\010\007\067\010\022\011\023\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\010\035" +
    "\011\023\001\001\000\006\010\030\011\023\001\001\000" +
    "\002\001\001\000\004\011\034\001\001\000\004\011\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\005\037\007\025\010\022\011\023\001\001" +
    "\000\002\001\001\000\012\005\041\007\025\010\022\011" +
    "\023\001\001\000\002\001\001\000\012\005\043\007\025" +
    "\010\022\011\023\001\001\000\002\001\001\000\012\005" +
    "\045\007\025\010\022\011\023\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\002\053\003" +
    "\052\004\054\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\012\005\060\007\025\010\022\011\023" +
    "\001\001\000\002\001\001\000\012\005\062\007\025\010" +
    "\022\011\023\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\002\053\003\066\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\005\072\007\025\010\022\011\023\001\001\000\002\001" +
    "\001\000\012\005\074\007\025\010\022\011\023\001\001" +
    "\000\002\001\001\000\012\005\076\007\025\010\022\011" +
    "\023\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\002\053\003\052\004\102\001\001\000" +
    "\002\001\001\000\012\005\104\007\025\010\022\011\023" +
    "\001\001\000\002\001\001\000\012\005\106\007\025\010" +
    "\022\011\023\001\001\000\002\001\001\000\012\005\110" +
    "\007\025\010\022\011\023\001\001\000\002\001\001\000" +
    "\012\005\112\007\025\010\022\011\023\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\002" +
    "\053\003\052\004\116\001\001\000\002\001\001\000\012" +
    "\005\120\007\025\010\022\011\023\001\001\000\002\001" +
    "\001\000\012\005\122\007\025\010\022\011\023\001\001" +
    "\000\002\001\001\000\012\005\124\007\025\010\022\011" +
    "\023\001\001\000\002\001\001\000\012\005\126\007\025" +
    "\010\022\011\023\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\002\053\003\052\004\132" +
    "\001\001\000\002\001\001\000\012\005\134\007\025\010" +
    "\022\011\023\001\001\000\002\001\001\000\012\005\136" +
    "\007\025\010\022\011\023\001\001\000\002\001\001\000" +
    "\012\005\140\007\025\010\022\011\023\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\002" +
    "\053\003\052\004\144\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        private int numero =0;
        private int termino=0;
        private int fact=0;
        private int exprecion=0;
        private boolean bandera = true;
        private Settings parametrosSoft = new Settings();
        private reporteError espera = new reporteError();
        private List<String> errorsList = new ArrayList();
        private List<Object> sentencias = new ArrayList();

        public parser(appLexer lex){
                super(lex);
        }

        public Settings respuesta(){
                return parametrosSoft;
        }

        public void report_error(String message, Object info){
                System.out.println("reporterror");
        }
        public void report_fatal_error(String message, Object info){
                System.out.println("reportfatal");
        }
        public void syntax_error(Symbol cur_token){
                ParamsSymbol symboloError = (ParamsSymbol) cur_token.value;
                String err = String.format("Error de Sintaxis \"" + symboloError.lexema + "\" Linea: " + symboloError.line + " Columna: " + symboloError.column);
                err = err + "\n";
                err = err + "Se esperaba: ";
                for (int i = 0; i < expected_token_ids().size(); i++) {
                        if (!espera.simboloEsperado(expected_token_ids().get(i)).equals("")) {
                                err = err + espera.simboloEsperado(expected_token_ids().get(i));
                                if (i < (expected_token_ids().size() - 1)) {
                                        err = err + " ó ";
                                }
                        }
                }
                errorsList.add(err);
                System.out.println(err);
        }
        protected int error_sync_size() {
		return 1;
	}
        public List<Object> getSentencias() {
                return sentencias;
        }
        public List<String> getErrorsList(){
	        return errorsList
	        ;
	}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // s ::= RESERVATE_WORD_GRAPHIC shapeParams 
            {
              Object RESULT =null;
		//System.out.println("Inicio de produccion");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // shapeParams ::= SHAPE_CIR PARENTECIS_APERTURA var COMA var COMA var COMA COLOR PARENTECIS_CIERRE y 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                                                                                        //System.out.println("Figura generada: "+((ParamsSymbol)f).lexema+" Color: "+((ParamsSymbol)e1).lexema);
                                                                                                                        sentencias.add(new Circulo(0, 0, 0,((ParamsSymbol)e1).lexema));
                                                                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("shapeParams",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // shapeParams ::= SHAPE_CUA PARENTECIS_APERTURA var COMA var COMA var COMA COLOR PARENTECIS_CIERRE y 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-10)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                                                                                //System.out.println("Figura generada: "+((ParamsSymbol)f).lexema+" Color: "+((ParamsSymbol)e1).lexema);
                                                                                                                sentencias.add(new Cuadrado(0, 0, 0, ((ParamsSymbol)e1).lexema));
                                                                                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("shapeParams",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // shapeParams ::= SHAPE_REC PARENTECIS_APERTURA var COMA var COMA var COMA var COMA COLOR PARENTECIS_CIERRE y 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-12)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                                                                                                //System.out.println("Figura generada: "+((ParamsSymbol)f).lexema+" Color: "+((ParamsSymbol)e1).lexema);
                                                                                                                                sentencias.add(new Rectangulo(0, 0, 0, 0, ((ParamsSymbol)e1).lexema));
                                                                                                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("shapeParams",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // shapeParams ::= SHAPE_LIN PARENTECIS_APERTURA var COMA var COMA var COMA var COMA COLOR PARENTECIS_CIERRE y 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-12)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                                                                                                //System.out.println("Figura generada: "+((ParamsSymbol)f).lexema+" Color: "+((ParamsSymbol)e1).lexema);
                                                                                                                                sentencias.add(new Linea(0, 0, 0, 0, ((ParamsSymbol)e1).lexema));
                                                                                                                        
              CUP$parser$result = parser.getSymbolFactory().newSymbol("shapeParams",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-12)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // shapeParams ::= SHAPE_POL PARENTECIS_APERTURA var COMA var COMA var COMA var COMA var COMA COLOR PARENTECIS_CIERRE y 
            {
              Object RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)).right;
		Object f = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-14)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                                                                                                        //System.out.println("Figura generada: "+((ParamsSymbol)f).lexema+" Color: "+((ParamsSymbol)e1).lexema);
                                                                                                                                        sentencias.add(new Poligono(0, 0, 0, 0, 0, ((ParamsSymbol)e1).lexema));
                                                                                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("shapeParams",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-14)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // shapeParams ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("shapeParams",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // y ::= RESERVATE_WORD_ANIMATION RESERVATE_WORD_OBJECT RESERVATE_WORD_REFERENCE PARENTECIS_APERTURA var COMA var COMA ANIMATION PARENTECIS_CIERRE t 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
                                                                                                                                                                        //System.out.println("Animacion de figura");
                                                                                                                                                                        sentencias.add(new Animar(0, 0, ((ParamsSymbol)e1).lexema));
                                                                                                                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("y",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // y ::= t 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("y",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // t ::= s 
            {
              Object RESULT =null;
		//System.out.println("RE-inicio de produccion");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("t",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // t ::= 
            {
              Object RESULT =null;
		//System.out.println("Fin de analisis");
              CUP$parser$result = parser.getSymbolFactory().newSymbol("t",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // var ::= expr 
            {
              Object RESULT =null;
		      
                        //System.out.println("Final de operacion: "+exprecion);
                        parametrosSoft.agregarNumero(exprecion);
                        exprecion =0;
                        bandera =true;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("var",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // var ::= error 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("var",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expr ::= expr SUMA term 
            {
              Object RESULT =null;
		
                                        exprecion = exprecion + termino;
                                        //System.out.println("El resultado de la suma es: "+exprecion);
                                        termino=0;
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr RESTA term 
            {
              Object RESULT =null;
		
                                        exprecion = exprecion + termino;
                                        //System.out.println("El resultado de la resta es:"+exprecion);
                                        termino = 0;
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= term 
            {
              Object RESULT =null;
		
                                        exprecion = termino;
                                        //System.out.println("El termino es: "+termino);
                                        termino=0;
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // term ::= term MULTI factor 
            {
              Object RESULT =null;
		
                                        termino = termino * fact;
                                        //System.out.println("El resultado de la multiplicacion es: "+termino);
                                        fact = 0;
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // term ::= term DIV factor 
            {
              Object RESULT =null;
		
                                        termino = termino / fact;
                                        //System.out.println("El resultado de la divicion es: "+termino);
                                        fact = 0;
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // term ::= factor 
            {
              Object RESULT =null;
		
                                        //System.out.println("El factor es:"+fact);
                                        termino = fact;
                                        fact =0;
                                        numero =0;
                                        
                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("term",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // factor ::= NUMBER 
            {
              Object RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object e1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                                                                        if(exprecion == 0 && bandera ){
                                                                                //System.out.println("Inicio de operacion");
                                                                                bandera =false;
                                                                        }
                                                                        numero = Integer.parseInt(((ParamsSymbol)e1).lexema);
                                                                        //System.out.println("El numero es: "+numero);
                                                                        fact = numero;
                                                                        
                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // factor ::= PARENTECIS_APERTURA expr PARENTECIS_CIERRE 
            {
              Object RESULT =null;
		
                                                                        if(exprecion == 0 && bandera){
                                                                                //System.out.println("Inicio de operacion");
                                                                                bandera =false;
                                                                        }
                                                                        fact = exprecion;
                                                                        //System.out.println("El resultado de (exp): "+fact);
                                                                        exprecion=0;
                                                                        
                                                                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("factor",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
