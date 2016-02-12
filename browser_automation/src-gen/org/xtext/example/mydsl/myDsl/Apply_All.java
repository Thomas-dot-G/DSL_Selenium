/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply All</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Apply_All#getElt <em>Elt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Apply_All#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getApply_All()
 * @model
 * @generated
 */
public interface Apply_All extends Operation
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getApply_All_Elt()
   * @model containment="true"
   * @generated
   */
  Element getElt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Apply_All#getElt <em>Elt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elt</em>' containment reference.
   * @see #getElt()
   * @generated
   */
  void setElt(Element value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Operation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getApply_All_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // Apply_All
