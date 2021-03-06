/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.myDsl.Action;
import org.xtext.example.mydsl.myDsl.AddCondition;
import org.xtext.example.mydsl.myDsl.Apply_All;
import org.xtext.example.mydsl.myDsl.Browser_Task;
import org.xtext.example.mydsl.myDsl.CallFunction;
import org.xtext.example.mydsl.myDsl.Click;
import org.xtext.example.mydsl.myDsl.ComparableElt;
import org.xtext.example.mydsl.myDsl.Condition;
import org.xtext.example.mydsl.myDsl.DoLoop;
import org.xtext.example.mydsl.myDsl.Element;
import org.xtext.example.mydsl.myDsl.Elements;
import org.xtext.example.mydsl.myDsl.EltType;
import org.xtext.example.mydsl.myDsl.Fill;
import org.xtext.example.mydsl.myDsl.ForLoop;
import org.xtext.example.mydsl.myDsl.FuncVar;
import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.Go;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.Operation;
import org.xtext.example.mydsl.myDsl.Program;
import org.xtext.example.mydsl.myDsl.Select;
import org.xtext.example.mydsl.myDsl.SimpleOp;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.myDsl.StringType;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.myDsl.Text;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.Verify;
import org.xtext.example.mydsl.myDsl.WhileLoop;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Program program = ((Program) _head);
    CharSequence _genProgram = this.genProgram(program);
    fsa.generateFile("TestInternal.java", _genProgram);
  }
  
  public CharSequence genProgram(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.chrome.ChromeDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebElement;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.By;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class TestInternal {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Function> _func = p.getFunc();
      for(final Function e : _func) {
        _builder.append("\t");
        _builder.append("public static void ");
        String _name = e.getName();
        _builder.append(_name, "\t");
        _builder.append("(");
        _builder.newLineIfNotEmpty();
        {
          EList<FuncVar> _vars = e.getVars();
          for(final FuncVar v : _vars) {
            _builder.append("\t");
            {
              EList<FuncVar> _vars_1 = e.getVars();
              int _indexOf = _vars_1.indexOf(v);
              boolean _greaterThan = (_indexOf > 0);
              if (_greaterThan) {
                _builder.append(",");
              }
            }
            _builder.newLineIfNotEmpty();
            {
              StringType _type = v.getType();
              String _elt = _type.getElt();
              boolean _notEquals = (!Objects.equal(_elt, null));
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("WebElement ");
                String _name_1 = v.getName();
                _builder.append(_name_1, "\t");
                _builder.newLineIfNotEmpty();
              } else {
                {
                  StringType _type_1 = v.getType();
                  String _elts = _type_1.getElts();
                  boolean _notEquals_1 = (!Objects.equal(_elts, null));
                  if (_notEquals_1) {
                    _builder.append("List<WebElement> ");
                    String _name_2 = v.getName();
                    _builder.append(_name_2, "");
                    _builder.newLineIfNotEmpty();
                  } else {
                    {
                      StringType _type_2 = v.getType();
                      String _cond = _type_2.getCond();
                      boolean _notEquals_2 = (!Objects.equal(_cond, null));
                      if (_notEquals_2) {
                        _builder.append("Boolean ");
                        String _name_3 = v.getName();
                        _builder.append(_name_3, "");
                        _builder.newLineIfNotEmpty();
                      } else {
                        _builder.append("String ");
                        String _name_4 = v.getName();
                        _builder.append(_name_4, "");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
            _builder.append("\t\t\t\t    \t");
          }
        }
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t    \t\t");
        EList<Operation> _operations = e.getOperations();
        CharSequence _genOperations = this.genOperations(_operations);
        _builder.append(_genOperations, "\t\t\t\t    \t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Start building the program\");");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _genCore = this.genCore(p);
    _builder.append(_genCore, "\t\t");
    _builder.append("\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("System.out.println(\"Finish building the program\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genCore(final Program p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.setProperty(\"webdriver.chrome.driver\", \"C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("WebDriver driver=new  ChromeDriver();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("driver.get(\"https://www.google.com\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//Selenium selenium = new DefaultSelenium(\"localhost\"\", 4444, \"\"*firefox\"\", \"http://www.google.com\");");
    _builder.newLine();
    _builder.append("\t\t");
    Browser_Task _b = p.getB();
    EList<Operation> _operations = _b.getOperations();
    CharSequence _genOperations = this.genOperations(_operations);
    _builder.append(_genOperations, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("driver.quit();");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence genAction(final Action a, final int i, final Elements elt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = Objects.equal(elt, null);
      if (_equals) {
        {
          if ((a instanceof Click)) {
            _builder.append("WebElement element_");
            _builder.append(i, "");
            _builder.append(" = ");
            Element _elt = ((Click)a).getElt();
            EltType _type = _elt.getType();
            CharSequence _genCore = this.genCore(_type);
            _builder.append(_genCore, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("element_");
            _builder.append(i, "");
            _builder.append(".click();");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t        ");
        {
          if ((a instanceof Go)) {
            _builder.append("driver.get(\"");
            Text _link = ((Go)a).getLink();
            String _name = _link.getName();
            _builder.append(_name, "\t        ");
            _builder.append("\");");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if ((a instanceof Fill)) {
            _builder.append("WebElement element_");
            _builder.append(i, "");
            _builder.append(" = ");
            Element _elt_1 = ((Fill)a).getElt();
            EltType _type_1 = _elt_1.getType();
            CharSequence _genCore_1 = this.genCore(_type_1);
            _builder.append(_genCore_1, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("element_");
            _builder.append(i, "");
            _builder.append(".sendKeys(\"");
            Text _fillwith = ((Fill)a).getFillwith();
            String _name_1 = _fillwith.getName();
            _builder.append(_name_1, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t        \t");
            _builder.append("element_");
            _builder.append(i, "\t        \t");
            _builder.append(".submit();");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((a instanceof Select)) {
            _builder.append("\t        ");
            _builder.append("WebElement element_");
            _builder.append(i, "\t        ");
            _builder.append(" = ");
            Element _elt_2 = ((Select)a).getElt();
            EltType _type_2 = _elt_2.getType();
            CharSequence _genCore_2 = this.genCore(_type_2);
            _builder.append(_genCore_2, "\t        ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("element_");
            _builder.append(i, "\t\t\t\t");
            _builder.append(".click();");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((a instanceof Verify)) {
            _builder.append("\t        ");
            _builder.append("WebElement element_");
            _builder.append(i, "\t        ");
            _builder.append(" = ");
            Element _elt_3 = ((Verify)a).getElt();
            EltType _type_3 = _elt_3.getType();
            CharSequence _genCore_3 = this.genCore(_type_3);
            _builder.append(_genCore_3, "\t        ");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("String message_");
            _builder.append(i, "\t\t\t\t");
            _builder.append(" = element_");
            _builder.append(i, "\t\t\t\t");
            _builder.append(".getText();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t");
            _builder.append("System.out.println(message_");
            _builder.append(i, "\t\t\t\t");
            _builder.append(".contains(\"");
            Text _find = ((Verify)a).getFind();
            String _name_2 = _find.getName();
            _builder.append(_name_2, "\t\t\t\t");
            _builder.append("\"));");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        {
          if ((a instanceof Click)) {
            _builder.append("elt.click();");
          }
        }
        _builder.newLineIfNotEmpty();
        {
          if ((a instanceof Fill)) {
            _builder.append("elt.sendKeys(\"");
            Text _fillwith_1 = ((Fill)a).getFillwith();
            String _name_3 = _fillwith_1.getName();
            _builder.append(_name_3, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t        \t");
            _builder.append("elt.submit();");
            _builder.newLine();
          }
        }
        {
          if ((a instanceof Select)) {
            _builder.append("elt.click();");
            _builder.newLine();
          }
        }
        {
          if ((a instanceof Verify)) {
            _builder.append("elt.getText().contains(\"");
            Text _find_1 = ((Verify)a).getFind();
            String _name_4 = _find_1.getName();
            _builder.append(_name_4, "");
            _builder.append("\"));");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence genCore(final EltType e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof Tag)) {
        _builder.append("driver.findElement(By.");
        String _html = ((Tag)e).getHtml();
        _builder.append(_html, "");
        _builder.append("(\"");
        Text _tag = ((Tag)e).getTag();
        String _name = _tag.getName();
        _builder.append(_name, "");
        _builder.append("\"))");
        _builder.newLineIfNotEmpty();
      } else {
        {
          if ((e instanceof Variable)) {
            String _name_1 = ((Variable)e).getName();
            _builder.append(_name_1, "");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("driver.getCurrentUrl()");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genCores(final EltType e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof Tag)) {
        _builder.append("driver.findElements(By.");
        String _html = ((Tag)e).getHtml();
        _builder.append(_html, "");
        _builder.append("(\"");
        Text _tag = ((Tag)e).getTag();
        String _name = _tag.getName();
        _builder.append(_name, "");
        _builder.append("\"))");
        _builder.newLineIfNotEmpty();
      } else {
        {
          if ((e instanceof Variable)) {
            String _name_1 = ((Variable)e).getName();
            _builder.append(_name_1, "");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("[driver.getCurrentUrl()]");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genCore(final AddCondition c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _op = c.getOp();
      boolean _equals = Objects.equal(_op, "And");
      if (_equals) {
        _builder.append("&& ");
        Condition _cond = c.getCond();
        CharSequence _genCore = this.genCore(_cond);
        _builder.append(_genCore, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _op_1 = c.getOp();
      boolean _equals_1 = Objects.equal(_op_1, "Or");
      if (_equals_1) {
        _builder.append("|| ");
        Condition _cond_1 = c.getCond();
        CharSequence _genCore_1 = this.genCore(_cond_1);
        _builder.append(_genCore_1, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genCore(final Condition c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((c instanceof Variable)) {
        String _name = ((Variable)c).getName();
        _builder.append(_name, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((c instanceof Verify)) {
        _builder.append("(");
        Element _elt = ((Verify)c).getElt();
        EltType _type = _elt.getType();
        CharSequence _genCore = this.genCore(_type);
        _builder.append(_genCore, "");
        {
          boolean _or = false;
          Element _elt_1 = ((Verify)c).getElt();
          EltType _type_1 = _elt_1.getType();
          if ((_type_1 instanceof Tag)) {
            _or = true;
          } else {
            Element _elt_2 = ((Verify)c).getElt();
            EltType _type_2 = _elt_2.getType();
            _or = (_type_2 instanceof Variable);
          }
          if (_or) {
            _builder.append(".getText()");
          }
        }
        _builder.append(".contains(\"");
        Text _find = ((Verify)c).getFind();
        String _name_1 = _find.getName();
        _builder.append(_name_1, "");
        _builder.append("\"))");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      if ((c instanceof SimpleOp)) {
        _builder.append("(");
        ComparableElt _elt1 = ((SimpleOp)c).getElt1();
        CharSequence _genCore_1 = this.genCore(_elt1);
        _builder.append(_genCore_1, "");
        String _op = ((SimpleOp)c).getOp();
        _builder.append(_op, "");
        ComparableElt _elt2 = ((SimpleOp)c).getElt2();
        CharSequence _genCore_2 = this.genCore(_elt2);
        _builder.append(_genCore_2, "");
        _builder.append(")");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genCore(final ComparableElt e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Text _text = e.getText();
      boolean _notEquals = (!Objects.equal(_text, null));
      if (_notEquals) {
        Text _text_1 = e.getText();
        CharSequence _genText = this.genText(_text_1);
        _builder.append(_genText, "");
      } else {
        int _inte = e.getInte();
        _builder.append(_inte, "");
      }
    }
    return _builder;
  }
  
  public CharSequence genText(final Text t) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Variable _vari = t.getVari();
      boolean _notEquals = (!Objects.equal(_vari, null));
      if (_notEquals) {
        Variable _vari_1 = t.getVari();
        String _name = _vari_1.getName();
        _builder.append(_name, "");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      String _name_1 = t.getName();
      boolean _notEquals_1 = (!Objects.equal(_name_1, null));
      if (_notEquals_1) {
        _builder.append("\"");
        String _name_2 = t.getName();
        _builder.append(_name_2, "");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence genOperations(final EList<Operation> operations) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Operation e : operations) {
        int _indexOf = operations.indexOf(e);
        CharSequence _genOperation = this.genOperation(e, _indexOf);
        _builder.append(_genOperation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genOperation(final Operation e, final int i) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof Action)) {
        CharSequence _genAction = this.genAction(((Action)e), i, null);
        _builder.append(_genAction, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((e instanceof Loop)) {
        _builder.append("    \t");
        CharSequence _genCore = this.genCore(((Loop)e));
        _builder.append(_genCore, "    \t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((e instanceof Apply_All)) {
        _builder.append("    \t");
        _builder.append("for(WebElement elt:");
        Elements _elt = ((Apply_All)e).getElt();
        EltType _type = _elt.getType();
        CharSequence _genCores = this.genCores(_type);
        _builder.append(_genCores, "    \t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        {
          EList<Action> _actions = ((Apply_All)e).getActions();
          for(final Action op : _actions) {
            _builder.append("    \t");
            _builder.append("\t");
            Elements _elt_1 = ((Apply_All)e).getElt();
            CharSequence _genAction_1 = this.genAction(op, 0, _elt_1);
            _builder.append(_genAction_1, "    \t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    \t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      if ((e instanceof If)) {
        _builder.append("    \t");
        CharSequence _genCore_1 = this.genCore(((If)e));
        _builder.append(_genCore_1, "    \t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      if ((e instanceof Store)) {
        {
          Type _t = ((Store)e).getT();
          Element _elt_2 = _t.getElt();
          boolean _notEquals = (!Objects.equal(_elt_2, null));
          if (_notEquals) {
            _builder.append("    \t");
            _builder.append("WebElement ");
            String _vari = ((Store)e).getVari();
            _builder.append(_vari, "    \t");
            _builder.append(" = ");
            Type _t_1 = ((Store)e).getT();
            Element _elt_3 = _t_1.getElt();
            EltType _type_1 = _elt_3.getType();
            CharSequence _genCore_2 = this.genCore(_type_1);
            _builder.append(_genCore_2, "    \t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          } else {
            {
              Type _t_2 = ((Store)e).getT();
              Elements _elts = _t_2.getElts();
              boolean _notEquals_1 = (!Objects.equal(_elts, null));
              if (_notEquals_1) {
                _builder.append("    \t");
                _builder.append("List<WebElement> ");
                String _vari_1 = ((Store)e).getVari();
                _builder.append(_vari_1, "    \t");
                _builder.append(" = ");
                Type _t_3 = ((Store)e).getT();
                Elements _elts_1 = _t_3.getElts();
                EltType _type_2 = _elts_1.getType();
                CharSequence _genCores_1 = this.genCores(_type_2);
                _builder.append(_genCores_1, "    \t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              } else {
                {
                  Type _t_4 = ((Store)e).getT();
                  Condition _cond = _t_4.getCond();
                  boolean _notEquals_2 = (!Objects.equal(_cond, null));
                  if (_notEquals_2) {
                    _builder.append("Boolean ");
                    String _vari_2 = ((Store)e).getVari();
                    _builder.append(_vari_2, "");
                    _builder.append(" = ");
                    Type _t_5 = ((Store)e).getT();
                    Condition _cond_1 = _t_5.getCond();
                    CharSequence _genCore_3 = this.genCore(_cond_1);
                    _builder.append(_genCore_3, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("String ");
                    String _vari_3 = ((Store)e).getVari();
                    _builder.append(_vari_3, "");
                    _builder.append(" = ");
                    Type _t_6 = ((Store)e).getT();
                    Text _text = _t_6.getText();
                    _builder.append(_text, "");
                    _builder.append(";");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            }
          }
        }
      }
    }
    {
      if ((e instanceof CallFunction)) {
        _builder.append("    \t");
        _builder.append("TestInternal.");
        String _name = ((CallFunction)e).getName();
        _builder.append(_name, "    \t");
        _builder.append("(");
        {
          EList<Variable> _vars = ((CallFunction)e).getVars();
          for(final Variable v : _vars) {
            String _name_1 = v.getName();
            _builder.append(_name_1, "    \t");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence genCore(final Loop l) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((l instanceof ForLoop)) {
        _builder.append("for(int i=");
        int _start = ((ForLoop)l).getStart();
        _builder.append(_start, "");
        _builder.append("; i<");
        int _end = ((ForLoop)l).getEnd();
        _builder.append(_end, "");
        _builder.append("; i=i+");
        int _step = ((ForLoop)l).getStep();
        _builder.append(_step, "");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<Operation> _operations = ((ForLoop)l).getOperations();
        Object _genOperations = this.genOperations(_operations);
        _builder.append(_genOperations, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      if ((l instanceof WhileLoop)) {
        _builder.append("while(");
        Condition _c = ((WhileLoop)l).getC();
        CharSequence _genCore = this.genCore(_c);
        _builder.append(_genCore, "");
        {
          EList<AddCondition> _add = ((WhileLoop)l).getAdd();
          for(final AddCondition c : _add) {
            CharSequence _genCore_1 = this.genCore(c);
            _builder.append(_genCore_1, "");
          }
        }
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<Operation> _operations_1 = ((WhileLoop)l).getOperations();
        Object _genOperations_1 = this.genOperations(_operations_1);
        _builder.append(_genOperations_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      if ((l instanceof DoLoop)) {
        EList<Operation> _operations_2 = ((DoLoop)l).getOperations();
        Object _genOperations_2 = this.genOperations(_operations_2);
        _builder.append(_genOperations_2, "");
        _builder.newLineIfNotEmpty();
        _builder.append("while(");
        Condition _c_1 = ((DoLoop)l).getC();
        CharSequence _genCore_2 = this.genCore(_c_1);
        _builder.append(_genCore_2, "");
        {
          EList<AddCondition> _add_1 = ((DoLoop)l).getAdd();
          for(final AddCondition c_1 : _add_1) {
            CharSequence _genCore_3 = this.genCore(c_1);
            _builder.append(_genCore_3, "");
          }
        }
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<Operation> _operations_3 = ((DoLoop)l).getOperations();
        Object _genOperations_3 = this.genOperations(_operations_3);
        _builder.append(_genOperations_3, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence genCore(final If i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    Condition _cond = i.getCond();
    CharSequence _genCore = this.genCore(_cond);
    _builder.append(_genCore, "");
    {
      EList<AddCondition> _add = i.getAdd();
      for(final AddCondition c : _add) {
        CharSequence _genCore_1 = this.genCore(c);
        _builder.append(_genCore_1, "");
      }
    }
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    EList<Operation> _operations = i.getOperations();
    Object _genOperations = this.genOperations(_operations);
    _builder.append(_genOperations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("else{");
    _builder.newLine();
    _builder.append("\t");
    EList<Operation> _operationsbis = i.getOperationsbis();
    Object _genOperations_1 = this.genOperations(_operationsbis);
    _builder.append(_genOperations_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
