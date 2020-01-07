//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//


package io.mosip.kernel.core.cbeffutil.jaxbclasses;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import io.mosip.kernel.core.cbeffutil.common.DateAdapter;


/**
 * <p>Java class for BDBInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BDBInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChallengeResponse" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}UUIDType" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}RegistryIDType" minOccurs="0"/>
 *         &lt;element name="Encryption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}MultipleTypesType" minOccurs="0"/>
 *         &lt;element name="Subtype" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}SubtypeType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}ProcessedLevelType" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}RegistryIDType" minOccurs="0"/>
 *         &lt;element name="CaptureDevice" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}RegistryIDType" minOccurs="0"/>
 *         &lt;element name="FeatureExtractionAlgorithm" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}RegistryIDType" minOccurs="0"/>
 *         &lt;element name="ComparisonAlgorithm" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}RegistryIDType" minOccurs="0"/>
 *         &lt;element name="CompressionAlgorithm" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}RegistryIDType" minOccurs="0"/>
 *         &lt;element name="Purpose" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}PurposeType" minOccurs="0"/>
 *         &lt;element name="Quality" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}QualityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BDBInfoType", propOrder = {
    "challengeResponse",
    "index",
    "format",
    "encryption",
    "creationDate",
    "notValidBefore",
    "notValidAfter",
    "type",
    "subtype",
    "level",
    "product",
    "captureDevice",
    "featureExtractionAlgorithm",
    "comparisonAlgorithm",
    "compressionAlgorithm",
    "purpose",
    "quality"
})
public class BDBInfoType {

    @XmlElement(name = "ChallengeResponse")
    protected byte[] challengeResponse;
    @XmlElement(name = "Index")
    protected String index;
    @XmlElement(name = "Format")
    protected RegistryIDType format;
    @XmlElement(name = "Encryption")
    protected Boolean encryption;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDateTime creationDate;
    @XmlElement(name = "NotValidBefore")
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDateTime notValidBefore;
    @XmlElement(name = "NotValidAfter")
    @XmlSchemaType(name = "dateTime")
    @XmlJavaTypeAdapter(DateAdapter.class)
    protected LocalDateTime notValidAfter;
    @XmlList
    @XmlElement(name = "Type")
    protected List<SingleType> type;
    @XmlList
    @XmlElement(name = "Subtype")
    protected List<String> subtype;
    @XmlElement(name = "Level")
    @XmlSchemaType(name = "string")
    protected ProcessedLevelType level;
    @XmlElement(name = "Product")
    protected RegistryIDType product;
    @XmlElement(name = "CaptureDevice")
    protected RegistryIDType captureDevice;
    @XmlElement(name = "FeatureExtractionAlgorithm")
    protected RegistryIDType featureExtractionAlgorithm;
    @XmlElement(name = "ComparisonAlgorithm")
    protected RegistryIDType comparisonAlgorithm;
    @XmlElement(name = "CompressionAlgorithm")
    protected RegistryIDType compressionAlgorithm;
    @XmlElement(name = "Purpose")
    @XmlSchemaType(name = "string")
    protected PurposeType purpose;
    @XmlElement(name = "Quality")
    protected QualityType quality;

    /**
     * Gets the value of the challengeResponse property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChallengeResponse() {
        return challengeResponse;
    }

    /**
     * Sets the value of the challengeResponse property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setChallengeResponse(byte[] value) {
        this.challengeResponse = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryIDType }
     *     
     */
    public RegistryIDType getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryIDType }
     *     
     */
    public void setFormat(RegistryIDType value) {
        this.format = value;
    }

    /**
     * Gets the value of the encryption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncryption() {
        return encryption;
    }

    /**
     * Sets the value of the encryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryption(Boolean value) {
        this.encryption = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setCreationDate(LocalDateTime value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setNotValidBefore(LocalDateTime value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setNotValidAfter(LocalDateTime value) {
        this.notValidAfter = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleTypeType }
     * 
     * 
     */
    public List<SingleType> getType() {
        if (type == null) {
            type = new ArrayList<SingleType>();
        }
        return this.type;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubtype() {
        if (subtype == null) {
            subtype = new ArrayList<String>();
        }
        return this.subtype;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessedLevelType }
     *     
     */
    public ProcessedLevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessedLevelType }
     *     
     */
    public void setLevel(ProcessedLevelType value) {
        this.level = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryIDType }
     *     
     */
    public RegistryIDType getProduct() {
        return product;
    }

    /**
	 * @param type the type to set
	 */
	public void setType(List<SingleType> type) {
		this.type = type;
	}

	/**
	 * @param subtype the subtype to set
	 */
	public void setSubtype(List<String> subtype) {
		this.subtype = subtype;
	}

	/**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryIDType }
     *     
     */
    public void setProduct(RegistryIDType value) {
        this.product = value;
    }

    /**
     * Gets the value of the captureDevice property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryIDType }
     *     
     */
    public RegistryIDType getCaptureDevice() {
        return captureDevice;
    }

    /**
     * Sets the value of the captureDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryIDType }
     *     
     */
    public void setCaptureDevice(RegistryIDType value) {
        this.captureDevice = value;
    }

    /**
     * Gets the value of the featureExtractionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryIDType }
     *     
     */
    public RegistryIDType getFeatureExtractionAlgorithm() {
        return featureExtractionAlgorithm;
    }

    /**
     * Sets the value of the featureExtractionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryIDType }
     *     
     */
    public void setFeatureExtractionAlgorithm(RegistryIDType value) {
        this.featureExtractionAlgorithm = value;
    }

    /**
     * Gets the value of the comparisonAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryIDType }
     *     
     */
    public RegistryIDType getComparisonAlgorithm() {
        return comparisonAlgorithm;
    }

    /**
     * Sets the value of the comparisonAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryIDType }
     *     
     */
    public void setComparisonAlgorithm(RegistryIDType value) {
        this.comparisonAlgorithm = value;
    }

    /**
     * Gets the value of the compressionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link RegistryIDType }
     *     
     */
    public RegistryIDType getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    /**
     * Sets the value of the compressionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistryIDType }
     *     
     */
    public void setCompressionAlgorithm(RegistryIDType value) {
        this.compressionAlgorithm = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeType }
     *     
     */
    public PurposeType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeType }
     *     
     */
    public void setPurpose(PurposeType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityType }
     *     
     */
    public QualityType getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityType }
     *     
     */
    public void setQuality(QualityType value) {
        this.quality = value;
    }

}