package code.with.vanilson.libraryapplication.common.constants;

/**
 * TimeZoneConstants
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-07-05
 */
public class TimeZoneConstants {

    public static final String ZONE_LISBON = "Europe/Lisbon";
    public static final String ZONE_NEW_YORK = "America/New_York";
    public static final String ZONE_LONDON = "Europe/London";
    public static final String ZONE_PARIS = "Europe/Paris";
    public static final String ZONE_TOKYO = "Asia/Tokyo";
    public static final String ZONE_SYDNEY = "Australia/Sydney";
    public static final String ZONE_DUBAI = "Asia/Dubai";
    public static final String ZONE_SAO_PAULO = "America/Sao_Paulo";
    public static final String ZONE_MOSCOW = "Europe/Moscow";
    public static final String ZONE_HONG_KONG = "Asia/Hong_Kong";

    // Add more zones as needed

    private TimeZoneConstants() {
        // Private constructor to prevent instantiation
        throw new AssertionError("Utility class cannot be instantiated");
    }

}
