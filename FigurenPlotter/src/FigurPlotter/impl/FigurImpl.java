/**
 */
package FigurPlotter.impl;

import FigurPlotter.Figur;
import FigurPlotter.FigurPlotterPackage;
import FigurPlotter.Point;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FigurPlotter.impl.FigurImpl#getName <em>Name</em>}</li>
 *   <li>{@link FigurPlotter.impl.FigurImpl#getFarbe <em>Farbe</em>}</li>
 *   <li>{@link FigurPlotter.impl.FigurImpl#isFilled <em>Filled</em>}</li>
 *   <li>{@link FigurPlotter.impl.FigurImpl#getStrokeWeight <em>Stroke Weight</em>}</li>
 *   <li>{@link FigurPlotter.impl.FigurImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link FigurPlotter.impl.FigurImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link FigurPlotter.impl.FigurImpl#getFigures <em>Figures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FigurImpl extends MinimalEObjectImpl.Container implements Figur {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFarbe() <em>Farbe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe()
	 * @generated
	 * @ordered
	 */
	protected static final String FARBE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarbe() <em>Farbe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarbe()
	 * @generated
	 * @ordered
	 */
	protected String farbe = FARBE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFilled() <em>Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilled() <em>Filled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilled()
	 * @generated
	 * @ordered
	 */
	protected boolean filled = FILLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeWeight() <em>Stroke Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int STROKE_WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrokeWeight() <em>Stroke Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWeight()
	 * @generated
	 * @ordered
	 */
	protected int strokeWeight = STROKE_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected int degree = DEGREE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected Point center;

	/**
	 * The cached value of the '{@link #getFigures() <em>Figures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<Figur> figures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FigurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FigurPlotterPackage.Literals.FIGUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFarbe() {
		return farbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFarbe(String newFarbe) {
		String oldFarbe = farbe;
		farbe = newFarbe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__FARBE, oldFarbe, farbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFilled() {
		return filled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilled(boolean newFilled) {
		boolean oldFilled = filled;
		filled = newFilled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__FILLED, oldFilled, filled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStrokeWeight() {
		return strokeWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrokeWeight(int newStrokeWeight) {
		int oldStrokeWeight = strokeWeight;
		strokeWeight = newStrokeWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__STROKE_WEIGHT, oldStrokeWeight, strokeWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDegree() {
		return degree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(int newDegree) {
		int oldDegree = degree;
		degree = newDegree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__DEGREE, oldDegree, degree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCenter(Point newCenter, NotificationChain msgs) {
		Point oldCenter = center;
		center = newCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__CENTER, oldCenter, newCenter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCenter(Point newCenter) {
		if (newCenter != center) {
			NotificationChain msgs = null;
			if (center != null)
				msgs = ((InternalEObject)center).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FigurPlotterPackage.FIGUR__CENTER, null, msgs);
			if (newCenter != null)
				msgs = ((InternalEObject)newCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FigurPlotterPackage.FIGUR__CENTER, null, msgs);
			msgs = basicSetCenter(newCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FigurPlotterPackage.FIGUR__CENTER, newCenter, newCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Figur> getFigures() {
		if (figures == null) {
			figures = new EObjectContainmentEList<Figur>(Figur.class, this, FigurPlotterPackage.FIGUR__FIGURES);
		}
		return figures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FigurPlotterPackage.FIGUR__CENTER:
				return basicSetCenter(null, msgs);
			case FigurPlotterPackage.FIGUR__FIGURES:
				return ((InternalEList<?>)getFigures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FigurPlotterPackage.FIGUR__NAME:
				return getName();
			case FigurPlotterPackage.FIGUR__FARBE:
				return getFarbe();
			case FigurPlotterPackage.FIGUR__FILLED:
				return isFilled();
			case FigurPlotterPackage.FIGUR__STROKE_WEIGHT:
				return getStrokeWeight();
			case FigurPlotterPackage.FIGUR__DEGREE:
				return getDegree();
			case FigurPlotterPackage.FIGUR__CENTER:
				return getCenter();
			case FigurPlotterPackage.FIGUR__FIGURES:
				return getFigures();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FigurPlotterPackage.FIGUR__NAME:
				setName((String)newValue);
				return;
			case FigurPlotterPackage.FIGUR__FARBE:
				setFarbe((String)newValue);
				return;
			case FigurPlotterPackage.FIGUR__FILLED:
				setFilled((Boolean)newValue);
				return;
			case FigurPlotterPackage.FIGUR__STROKE_WEIGHT:
				setStrokeWeight((Integer)newValue);
				return;
			case FigurPlotterPackage.FIGUR__DEGREE:
				setDegree((Integer)newValue);
				return;
			case FigurPlotterPackage.FIGUR__CENTER:
				setCenter((Point)newValue);
				return;
			case FigurPlotterPackage.FIGUR__FIGURES:
				getFigures().clear();
				getFigures().addAll((Collection<? extends Figur>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FigurPlotterPackage.FIGUR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FigurPlotterPackage.FIGUR__FARBE:
				setFarbe(FARBE_EDEFAULT);
				return;
			case FigurPlotterPackage.FIGUR__FILLED:
				setFilled(FILLED_EDEFAULT);
				return;
			case FigurPlotterPackage.FIGUR__STROKE_WEIGHT:
				setStrokeWeight(STROKE_WEIGHT_EDEFAULT);
				return;
			case FigurPlotterPackage.FIGUR__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case FigurPlotterPackage.FIGUR__CENTER:
				setCenter((Point)null);
				return;
			case FigurPlotterPackage.FIGUR__FIGURES:
				getFigures().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FigurPlotterPackage.FIGUR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FigurPlotterPackage.FIGUR__FARBE:
				return FARBE_EDEFAULT == null ? farbe != null : !FARBE_EDEFAULT.equals(farbe);
			case FigurPlotterPackage.FIGUR__FILLED:
				return filled != FILLED_EDEFAULT;
			case FigurPlotterPackage.FIGUR__STROKE_WEIGHT:
				return strokeWeight != STROKE_WEIGHT_EDEFAULT;
			case FigurPlotterPackage.FIGUR__DEGREE:
				return degree != DEGREE_EDEFAULT;
			case FigurPlotterPackage.FIGUR__CENTER:
				return center != null;
			case FigurPlotterPackage.FIGUR__FIGURES:
				return figures != null && !figures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", farbe: ");
		result.append(farbe);
		result.append(", filled: ");
		result.append(filled);
		result.append(", strokeWeight: ");
		result.append(strokeWeight);
		result.append(", degree: ");
		result.append(degree);
		result.append(')');
		return result.toString();
	}

} //FigurImpl
