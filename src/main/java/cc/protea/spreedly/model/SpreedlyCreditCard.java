package cc.protea.spreedly.model;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;

@Default
public class SpreedlyCreditCard {

    @Element(name = "first_name", required = false)
    public String           firstName;
    @Element(name = "last_name", required = false)
    public String           lastName;
    @Element(name = "full_name", required = false)
    public String           fullName;
    public String           number;
    @Element(name = "track_data", required = false)
    public String           trackData;
    public Integer          month;
    public Integer          year;
    @Element(name = "verification_value", required = false)
    public String           verificationValue;
    @Element(name = "card_type", required = false)
    public SpreedlyCardType cardType;
    public String           address1;
    public String           address2;
    public String           city;
    public String           state;
    public String           zip;
    public String           country;
    @Element(name = "phone_number", required = false)
    public String           phoneNumber;
    @Element(name = "shipping_address1", required = false)
    public String           shippingAddress1;
    @Element(name = "shipping_address2", required = false)
    public String           shippingAddress2;
    @Element(name = "shipping_city", required = false)
    public String           shippingCity;
    @Element(name = "shipping_state", required = false)
    public String           shippingState;
    @Element(name = "shipping_zip", required = false)
    public String           shippingZip;
    @Element(name = "shipping_country", required = false)
    public String           shippingCountry;
    @Element(name = "shipping_phone_number", required = false)
    public String           shippingPhoneNumber;
    public String           email;
    public Object           data;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public String getTrackData() {
        return trackData;
    }

    public void setTrackData(final String trackData) {
        this.trackData = trackData;
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

    public String getVerificationValue() {
        return verificationValue;
    }

    public void setVerificationValue(final String verificationValue) {
        this.verificationValue = verificationValue;
    }

    public SpreedlyCardType getCardType() {
        return cardType;
    }

    public void setCardType(final SpreedlyCardType cardType) {
        this.cardType = cardType;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Object getData() {
        return data;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpreedlyCreditCard that = (SpreedlyCreditCard) o;

        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (cardType != that.cardType) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (shippingAddress1 != null ? !shippingAddress1.equals(that.shippingAddress1) : that.shippingAddress1 != null) return false;
        if (shippingAddress2 != null ? !shippingAddress2.equals(that.shippingAddress2) : that.shippingAddress2 != null) return false;
        if (shippingCity != null ? !shippingCity.equals(that.shippingCity) : that.shippingCity != null) return false;
        if (shippingCountry != null ? !shippingCountry.equals(that.shippingCountry) : that.shippingCountry != null) return false;
        if (shippingPhoneNumber != null ? !shippingPhoneNumber.equals(that.shippingPhoneNumber) : that.shippingPhoneNumber != null) return false;
        if (shippingState != null ? !shippingState.equals(that.shippingState) : that.shippingState != null) return false;
        if (shippingZip != null ? !shippingZip.equals(that.shippingZip) : that.shippingZip != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (trackData != null ? !trackData.equals(that.trackData) : that.trackData != null) return false;
        if (verificationValue != null ? !verificationValue.equals(that.verificationValue) : that.verificationValue != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (zip != null ? !zip.equals(that.zip) : that.zip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (trackData != null ? trackData.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (verificationValue != null ? verificationValue.hashCode() : 0);
        result = 31 * result + (cardType != null ? cardType.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (shippingAddress1 != null ? shippingAddress1.hashCode() : 0);
        result = 31 * result + (shippingAddress2 != null ? shippingAddress2.hashCode() : 0);
        result = 31 * result + (shippingCity != null ? shippingCity.hashCode() : 0);
        result = 31 * result + (shippingState != null ? shippingState.hashCode() : 0);
        result = 31 * result + (shippingZip != null ? shippingZip.hashCode() : 0);
        result = 31 * result + (shippingCountry != null ? shippingCountry.hashCode() : 0);
        result = 31 * result + (shippingPhoneNumber != null ? shippingPhoneNumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SpreedlyCreditCard{" +
                       "firstName='" + firstName + '\'' +
                       ", lastName='" + lastName + '\'' +
                       ", fullName='" + fullName + '\'' +
                       ", number='" + number + '\'' +
                       ", trackData='" + trackData + '\'' +
                       ", month=" + month +
                       ", year=" + year +
                       ", verificationValue='" + verificationValue + '\'' +
                       ", cardType=" + cardType +
                       ", address1='" + address1 + '\'' +
                       ", address2='" + address2 + '\'' +
                       ", city='" + city + '\'' +
                       ", state='" + state + '\'' +
                       ", zip='" + zip + '\'' +
                       ", country='" + country + '\'' +
                       ", phoneNumber='" + phoneNumber + '\'' +
                       ", shippingAddress1='" + shippingAddress1 + '\'' +
                       ", shippingAddress2='" + shippingAddress2 + '\'' +
                       ", shippingCity='" + shippingCity + '\'' +
                       ", shippingState='" + shippingState + '\'' +
                       ", shippingZip='" + shippingZip + '\'' +
                       ", shippingCountry='" + shippingCountry + '\'' +
                       ", shippingPhoneNumber='" + shippingPhoneNumber + '\'' +
                       ", email='" + email + '\'' +
                       ", data=" + data +
                       '}';
    }
}
