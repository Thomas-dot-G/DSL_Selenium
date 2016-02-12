/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.AddCondition;
import org.xtext.example.mydsl.myDsl.Condition;
import org.xtext.example.mydsl.myDsl.DoLoop;
import org.xtext.example.mydsl.myDsl.Element;
import org.xtext.example.mydsl.myDsl.FindIf;
import org.xtext.example.mydsl.myDsl.Loop;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Operation;
import org.xtext.example.mydsl.myDsl.Text;
import org.xtext.example.mydsl.myDsl.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Find If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FindIfImpl#getAdd <em>Add</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FindIfImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FindIfImpl#getElt <em>Elt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FindIfImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindIfImpl extends ActionImpl implements FindIf
{
  /**
   * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdd()
   * @generated
   * @ordered
   */
  protected EList<AddCondition> add;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * The cached value of the '{@link #getElt() <em>Elt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElt()
   * @generated
   * @ordered
   */
  protected Element elt;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected Text text;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FindIfImpl()
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
    return MyDslPackage.Literals.FIND_IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AddCondition> getAdd()
  {
    if (add == null)
    {
      add = new EObjectContainmentEList<AddCondition>(AddCondition.class, this, MyDslPackage.FIND_IF__ADD);
    }
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, MyDslPackage.FIND_IF__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getElt()
  {
    return elt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElt(Element newElt, NotificationChain msgs)
  {
    Element oldElt = elt;
    elt = newElt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIND_IF__ELT, oldElt, newElt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElt(Element newElt)
  {
    if (newElt != elt)
    {
      NotificationChain msgs = null;
      if (elt != null)
        msgs = ((InternalEObject)elt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIND_IF__ELT, null, msgs);
      if (newElt != null)
        msgs = ((InternalEObject)newElt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIND_IF__ELT, null, msgs);
      msgs = basicSetElt(newElt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIND_IF__ELT, newElt, newElt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetText(Text newText, NotificationChain msgs)
  {
    Text oldText = text;
    text = newText;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FIND_IF__TEXT, oldText, newText);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(Text newText)
  {
    if (newText != text)
    {
      NotificationChain msgs = null;
      if (text != null)
        msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIND_IF__TEXT, null, msgs);
      if (newText != null)
        msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FIND_IF__TEXT, null, msgs);
      msgs = basicSetText(newText, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIND_IF__TEXT, newText, newText));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.FIND_IF__ADD:
        return ((InternalEList<?>)getAdd()).basicRemove(otherEnd, msgs);
      case MyDslPackage.FIND_IF__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
      case MyDslPackage.FIND_IF__ELT:
        return basicSetElt(null, msgs);
      case MyDslPackage.FIND_IF__TEXT:
        return basicSetText(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyDslPackage.FIND_IF__ADD:
        return getAdd();
      case MyDslPackage.FIND_IF__OPERATIONS:
        return getOperations();
      case MyDslPackage.FIND_IF__ELT:
        return getElt();
      case MyDslPackage.FIND_IF__TEXT:
        return getText();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.FIND_IF__ADD:
        getAdd().clear();
        getAdd().addAll((Collection<? extends AddCondition>)newValue);
        return;
      case MyDslPackage.FIND_IF__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case MyDslPackage.FIND_IF__ELT:
        setElt((Element)newValue);
        return;
      case MyDslPackage.FIND_IF__TEXT:
        setText((Text)newValue);
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
      case MyDslPackage.FIND_IF__ADD:
        getAdd().clear();
        return;
      case MyDslPackage.FIND_IF__OPERATIONS:
        getOperations().clear();
        return;
      case MyDslPackage.FIND_IF__ELT:
        setElt((Element)null);
        return;
      case MyDslPackage.FIND_IF__TEXT:
        setText((Text)null);
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
      case MyDslPackage.FIND_IF__ADD:
        return add != null && !add.isEmpty();
      case MyDslPackage.FIND_IF__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case MyDslPackage.FIND_IF__ELT:
        return elt != null;
      case MyDslPackage.FIND_IF__TEXT:
        return text != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Loop.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == WhileLoop.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DoLoop.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.FIND_IF__ADD: return MyDslPackage.CONDITION__ADD;
        case MyDslPackage.FIND_IF__OPERATIONS: return MyDslPackage.CONDITION__OPERATIONS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Loop.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == WhileLoop.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == DoLoop.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Condition.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.CONDITION__ADD: return MyDslPackage.FIND_IF__ADD;
        case MyDslPackage.CONDITION__OPERATIONS: return MyDslPackage.FIND_IF__OPERATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //FindIfImpl