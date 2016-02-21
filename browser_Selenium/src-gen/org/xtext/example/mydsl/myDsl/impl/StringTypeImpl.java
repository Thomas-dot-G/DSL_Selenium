/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.StringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StringTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StringTypeImpl#getElts <em>Elts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StringTypeImpl#getElt <em>Elt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.StringTypeImpl#getCond <em>Cond</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringTypeImpl extends MinimalEObjectImpl.Container implements StringType
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getElts() <em>Elts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElts()
   * @generated
   * @ordered
   */
  protected static final String ELTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElts() <em>Elts</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElts()
   * @generated
   * @ordered
   */
  protected String elts = ELTS_EDEFAULT;

  /**
   * The default value of the '{@link #getElt() <em>Elt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElt()
   * @generated
   * @ordered
   */
  protected static final String ELT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElt() <em>Elt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElt()
   * @generated
   * @ordered
   */
  protected String elt = ELT_EDEFAULT;

  /**
   * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected static final String COND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected String cond = COND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.STRING_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRING_TYPE__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElts()
  {
    return elts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElts(String newElts)
  {
    String oldElts = elts;
    elts = newElts;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRING_TYPE__ELTS, oldElts, elts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElt()
  {
    return elt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElt(String newElt)
  {
    String oldElt = elt;
    elt = newElt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRING_TYPE__ELT, oldElt, elt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(String newCond)
  {
    String oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STRING_TYPE__COND, oldCond, cond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.STRING_TYPE__TEXT:
        return getText();
      case MyDslPackage.STRING_TYPE__ELTS:
        return getElts();
      case MyDslPackage.STRING_TYPE__ELT:
        return getElt();
      case MyDslPackage.STRING_TYPE__COND:
        return getCond();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.STRING_TYPE__TEXT:
        setText((String)newValue);
        return;
      case MyDslPackage.STRING_TYPE__ELTS:
        setElts((String)newValue);
        return;
      case MyDslPackage.STRING_TYPE__ELT:
        setElt((String)newValue);
        return;
      case MyDslPackage.STRING_TYPE__COND:
        setCond((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STRING_TYPE__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case MyDslPackage.STRING_TYPE__ELTS:
        setElts(ELTS_EDEFAULT);
        return;
      case MyDslPackage.STRING_TYPE__ELT:
        setElt(ELT_EDEFAULT);
        return;
      case MyDslPackage.STRING_TYPE__COND:
        setCond(COND_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STRING_TYPE__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case MyDslPackage.STRING_TYPE__ELTS:
        return ELTS_EDEFAULT == null ? elts != null : !ELTS_EDEFAULT.equals(elts);
      case MyDslPackage.STRING_TYPE__ELT:
        return ELT_EDEFAULT == null ? elt != null : !ELT_EDEFAULT.equals(elt);
      case MyDslPackage.STRING_TYPE__COND:
        return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (text: ");
    result.append(text);
    result.append(", elts: ");
    result.append(elts);
    result.append(", elt: ");
    result.append(elt);
    result.append(", cond: ");
    result.append(cond);
    result.append(')');
    return result.toString();
  }

} //StringTypeImpl