/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Select#getElt <em>Elt</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSelect()
 * @model
 * @generated
 */
public interface Select extends Action
{
  /**
   * Returns the value of the '<em><b>Elt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elt</em>' containment reference.
   * @see #setElt(Element)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSelect_Elt()
   * @model containment="true"
   * @generated
   */
  Element getElt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Select#getElt <em>Elt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elt</em>' containment reference.
   * @see #getElt()
   * @generated
   */
  void setElt(Element value);

} // Select