//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.23 at 11:22:55 PM EDT 
//


package javaaxp.core.service.impl.document.jaxb;

import javaaxp.core.service.model.document.IGradientStops;
import javaaxp.core.service.model.document.page.IRadialGradientBrush;
import javaaxp.core.service.model.document.page.ITransform;
import javaaxp.core.service.model.document.page.STClrIntMode;
import javaaxp.core.service.model.document.page.STMappingMode;
import javaaxp.core.service.model.document.page.STSpreadMethod;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_RadialGradientBrush complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_RadialGradientBrush">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}RadialGradientBrush.Transform" minOccurs="0"/>
 *         &lt;element ref="{http://schemas.microsoft.com/xps/2005/06}RadialGradientBrush.GradientStops"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://schemas.microsoft.com/xps/2005/06}AG_RadialGradientBrush"/>
 *       &lt;attGroup ref="{http://schemas.microsoft.com/xps/2005/06}AG_GradientBrush"/>
 *       &lt;attGroup ref="{http://schemas.microsoft.com/xps/2005/06}AG_Brush"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_RadialGradientBrush", propOrder = {
    "radialGradientBrushTransform",
    "radialGradientBrushGradientStops"
})
public class CTRadialGradientBrush implements IRadialGradientBrush {

    @XmlElement(name = "RadialGradientBrush.Transform")
    protected CTCPTransform radialGradientBrushTransform;
    @XmlElement(name = "RadialGradientBrush.GradientStops", required = true)
    protected CTCPGradientStops radialGradientBrushGradientStops;
    @XmlAttribute(name = "Center", required = true)
    protected String center;
    @XmlAttribute(name = "GradientOrigin", required = true)
    protected String gradientOrigin;
    @XmlAttribute(name = "RadiusX", required = true)
    protected double radiusX;
    @XmlAttribute(name = "RadiusY", required = true)
    protected double radiusY;
    @XmlAttribute(name = "Transform")
    protected String transform;
    @XmlAttribute(name = "ColorInterpolationMode")
    protected STClrIntMode colorInterpolationMode;
    @XmlAttribute(name = "MappingMode", required = true)
    protected STMappingMode mappingMode;
    @XmlAttribute(name = "SpreadMethod")
    protected STSpreadMethod spreadMethod;
    @XmlAttribute(name = "Opacity")
    protected Double opacity;
    @XmlAttribute(name = "Key", namespace = "http://schemas.microsoft.com/xps/2005/06/resourcedictionary-key")
    protected String key;

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getRadialGradientBrushTransform()
	 */
    public ITransform getRadialGradientBrushTransform() {
        return radialGradientBrushTransform;
    }

    /**
     * Sets the value of the radialGradientBrushTransform property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCPTransform }
     *     
     */
    public void setRadialGradientBrushTransform(CTCPTransform value) {
        this.radialGradientBrushTransform = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getRadialGradientBrushGradientStops()
	 */
    public IGradientStops getRadialGradientBrushGradientStops() {
        return radialGradientBrushGradientStops;
    }

    /**
     * Sets the value of the radialGradientBrushGradientStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCPGradientStops }
     *     
     */
    public void setRadialGradientBrushGradientStops(CTCPGradientStops value) {
        this.radialGradientBrushGradientStops = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getCenter()
	 */
    public String getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getGradientOrigin()
	 */
    public String getGradientOrigin() {
        return gradientOrigin;
    }

    /**
     * Sets the value of the gradientOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradientOrigin(String value) {
        this.gradientOrigin = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getRadiusX()
	 */
    public double getRadiusX() {
        return radiusX;
    }

    /**
     * Sets the value of the radiusX property.
     * 
     */
    public void setRadiusX(double value) {
        this.radiusX = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getRadiusY()
	 */
    public double getRadiusY() {
        return radiusY;
    }

    /**
     * Sets the value of the radiusY property.
     * 
     */
    public void setRadiusY(double value) {
        this.radiusY = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getTransform()
	 */
    public String getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransform(String value) {
        this.transform = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getColorInterpolationMode()
	 */
    public STClrIntMode getColorInterpolationMode() {
        if (colorInterpolationMode == null) {
            return STClrIntMode.S_RGB_LINEAR_INTERPOLATION;
        } else {
            return colorInterpolationMode;
        }
    }

    /**
     * Sets the value of the colorInterpolationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STClrIntMode }
     *     
     */
    public void setColorInterpolationMode(STClrIntMode value) {
        this.colorInterpolationMode = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getMappingMode()
	 */
    public STMappingMode getMappingMode() {
        if (mappingMode == null) {
            return STMappingMode.ABSOLUTE;
        } else {
            return mappingMode;
        }
    }

    /**
     * Sets the value of the mappingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link STMappingMode }
     *     
     */
    public void setMappingMode(STMappingMode value) {
        this.mappingMode = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getSpreadMethod()
	 */
    public STSpreadMethod getSpreadMethod() {
        if (spreadMethod == null) {
            return STSpreadMethod.PAD;
        } else {
            return spreadMethod;
        }
    }

    /**
     * Sets the value of the spreadMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link STSpreadMethod }
     *     
     */
    public void setSpreadMethod(STSpreadMethod value) {
        this.spreadMethod = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getOpacity()
	 */
    public double getOpacity() {
        if (opacity == null) {
            return  1.0D;
        } else {
            return opacity;
        }
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOpacity(Double value) {
        this.opacity = value;
    }

    /* (non-Javadoc)
	 * @see xps.document.jaxb.IRadialGradientBrush#getKey()
	 */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

}
