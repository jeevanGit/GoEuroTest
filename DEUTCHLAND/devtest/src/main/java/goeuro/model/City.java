package goeuro.model;

import java.math.BigDecimal;

/**
 * The POJO mirrors the JSON string returned
 * @author Jeevan
 *
 */
public class City {
	String _id;
	String key;
	String name;
	String fullName;
	String iata_airport_code;
	String type;
	String country;
	Geopositions geo_position;
	String locationId;
	Boolean inEurope;
	String countryCode;
	Boolean coreCountry;
	Integer distance;
	
	
	
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}



	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}



	/**
	 * @return the iata_airport_code
	 */
	public String getIata_airport_code() {
		return iata_airport_code;
	}



	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @return the geo_position
	 */
	public Geopositions getGeo_position() {
		return geo_position;
	}



	/**
	 * @return the locationId
	 */
	public String getLocationId() {
		return locationId;
	}



	/**
	 * @return the inEurope
	 */
	public Boolean getInEurope() {
		return inEurope;
	}



	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}



	/**
	 * @return the coreCountry
	 */
	public Boolean getCoreCountry() {
		return coreCountry;
	}



	/**
	 * @return the distance
	 */
	public Integer getDistance() {
		return distance;
	}



	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}



	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	/**
	 * @param iata_airport_code the iata_airport_code to set
	 */
	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @param geo_position the geo_position to set
	 */
	public void setGeo_position(Geopositions geo_position) {
		this.geo_position = geo_position;
	}



	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}



	/**
	 * @param inEurope the inEurope to set
	 */
	public void setInEurope(Boolean inEurope) {
		this.inEurope = inEurope;
	}



	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}



	/**
	 * @param coreCountry the coreCountry to set
	 */
	public void setCoreCountry(Boolean coreCountry) {
		this.coreCountry = coreCountry;
	}



	/**
	 * @param distance the distance to set
	 */
	public void setDistance(Integer distance) {
		this.distance = distance;
	}



	public class Geopositions {
		BigDecimal latitude;
		BigDecimal longitude;
		
		public Geopositions() {
		}
		/**
		 * @return the latitude
		 */
		public BigDecimal getLatitude() {
			return latitude;
		}
		/**
		 * @return the longitude
		 */
		public BigDecimal getLongitude() {
			return longitude;
		}
		/**
		 * @param latitude the latitude to set
		 */
		public void setLatitude(BigDecimal latitude) {
			this.latitude = latitude;
		}
		/**
		 * @param longitude the longitude to set
		 */
		public void setLongitude(BigDecimal longitude) {
			this.longitude = longitude;
		}
	}

}
