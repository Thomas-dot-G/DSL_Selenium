/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Store#getVari <em>Vari</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Store#getT <em>T</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStore()
 * @model
 * @generated
 */
public interface Store extends Operation
{
  /**
   * Returns the value of the '<em><b>Vari</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vari</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vari</em>' attribute.
   * @see #setVari(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStore_Vari()
   * @model
   * @generated
   */
  String getVari();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Store#getVari <em>Vari</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vari</em>' attribute.
   * @see #getVari()
   * @generated
   */
  void setVari(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Type)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getStore_T()
   * @model containment="true"
   * @generated
   */
  Type getT();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Store#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Type value);

} // Store
