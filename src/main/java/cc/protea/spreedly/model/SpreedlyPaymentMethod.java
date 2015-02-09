package cc.protea.spreedly.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Root(name = "payment_method", strict = false)
@XmlAccessorType(XmlAccessType.FIELD)
public class SpreedlyPaymentMethod {

    public String                    token;
    @Element(name = "created_at")
    public Date                      createdOn;
    @Element(name = "updated_at")
    public Date                      updatedOn;
    public String                    email;
    public String                    data;
    @Element(name = "storage_state")
    public SpreedlyStorageState      storageState;
    @Element(name = "third_party_token")
    public String                    thirdPartyToken;
    public boolean                   test;
    @Element(name = "last_four_digits")
    public String                    lastFourDigits;
    @Element(name = "first_six_digits")
    public String                    firstSixDigits;
    @Element(name = "card_type")
    public SpreedlyCardType          cardType;
    @Element(name = "first_name")
    public String                    firstName;
    @Element(name = "last_name")
    public String                    lastName;
    public Integer                   month;
    public Integer                   year;
    public String                    address1;
    public String                    address2;
    public String                    city;
    public String                    state;
    public String                    zip;
    public String                    country;
    @Element(name = "phone_number")
    public String                    phoneNumber;
    @Element(name = "shipping_address1")
    public String                    shippingAddress1;
    @Element(name = "shipping_address2")
    public String                    shippingAddress2;
    @Element(name = "shipping_city")
    public String                    shippingCity;
    @Element(name = "shipping_state")
    public String                    shippingState;
    @Element(name = "shipping_zip")
    public String                    shippingZip;
    @Element(name = "shipping_country")
    public String                    shippingCountry;
    @Element(name = "shipping_phone_number")
    public String                    shippingPhoneNumber;
    @Element(name = "full_name")
    public String                    fullName;
    @Element(name = "eligible_for_card_updater")
    public boolean                   eligibleForCardUpdater;
    @Element(name = "payment_method_type")
    public SpreedlyPaymentMethodType paymentMethodType;
    @Element(name = "verification_value")
    public String                    verificationValue;
    @ElementList(name = "errors", entry = "error")
    public List<String> errors = new ArrayList<String>();
    @Element(name = "api_urls")
    public SpreedlyApiURLs apiUrls;
    public String          number;

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(final Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public SpreedlyStorageState getStorageState() {
        return storageState;
    }

    public void setStorageState(final SpreedlyStorageState storageState) {
        this.storageState = storageState;
    }

    public String getThirdPartyToken() {
        return thirdPartyToken;
    }

    public void setThirdPartyToken(final String thirdPartyToken) {
        this.thirdPartyToken = thirdPartyToken;
    }

    public boolean isTest() {
        return test;
    }

    public void setTest(final boolean test) {
        this.test = test;
    }

    public String getLastFourDigits() {
        return lastFourDigits;
    }

    public void setLastFourDigits(final String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    public String getFirstSixDigits() {
        return firstSixDigits;
    }

    public void setFirstSixDigits(final String firstSixDigits) {
        this.firstSixDigits = firstSixDigits;
    }

    public SpreedlyCardType getCardType() {
        return cardType;
    }

    public void setCardType(final SpreedlyCardType cardType) {
        this.cardType = cardType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(final Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(final Integer year) {
        this.year = year;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(final String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getShippingAddress1() {
        return shippingAddress1;
    }

    public void setShippingAddress1(final String shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public String getShippingAddress2() {
        return shippingAddress2;
    }

    public void setShippingAddress2(final String shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(final String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(final String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZip() {
        return shippingZip;
    }

    public void setShippingZip(final String shippingZip) {
        this.shippingZip = shippingZip;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(final String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingPhoneNumber() {
        return shippingPhoneNumber;
    }

    public void setShippingPhoneNumber(final String shippingPhoneNumber) {
        this.shippingPhoneNumber = shippingPhoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public boolean isEligibleForCardUpdater() {
        return eligibleForCardUpdater;
    }

    public void setEligibleForCardUpdater(final boolean eligibleForCardUpdater) {
        this.eligibleForCardUpdater = eligibleForCardUpdater;
    }

    public SpreedlyPaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(final SpreedlyPaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public String getVerificationValue() {
        return verificationValue;
    }

    public void setVerificationValue(final String verificationValue) {
        this.verificationValue = verificationValue;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(final List<String> errors) {
        this.errors = errors;
    }

    public SpreedlyApiURLs getApiUrls() {
        return apiUrls;
    }

    public void setApiUrls(final SpreedlyApiURLs apiUrls) {
        this.apiUrls = apiUrls;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }


}