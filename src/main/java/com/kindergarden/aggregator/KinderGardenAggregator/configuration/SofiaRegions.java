package com.kindergarden.aggregator.KinderGardenAggregator.configuration;

public enum SofiaRegions {
    BANKYA("24", "Bankya"),
    VITOSHA("17", "Vitosha"),
    VRUBNITSA("20", "Vrubnitsa"),
    VUZRAZHDANE("03", "Vrubnitsa"),
    IZGREV("08", "Izgrev"),
    ILINDEN("12", "Ilinden"),
    ISKAR("14", "Iskar"),
    KRSANA_POLYANA("11", "Krasna polyana"),
    KRSANO_SELO("02", "Krasno selo"),
    KREMIKOVTSI("22", "Kremikovtsi"),
    LOZENETZ("09", "Lozenetz"),
    LIULIN("19", "Liulin"),
    MLADOST("15", "Mladeost"),
    NADEZHDA("13", "Nadezhda"),
    NOVI_ISKAR("21", "Novi Iskar"),
    OBORISHTE("04", "Oborishte"),
    OVCHA_KUPEL("18", "Ovcha Kupel"),
    PANCHAREVO("23", "Pancharevo"),
    PODUYANE("6", "Poduyane"),
    SERDIKA("5", "Serdika"),
    SLATINA("7", "Slatine"),
    SREDETS("1", "Sredets"),
    STUDENTSKI("16", "Studentski"),
    TRIADITSA("10", "Triaditsa"),
    VSICHKI("0", "Vsichki");

    private final String regionId;
    private final String label;

    private SofiaRegions(String regionId, String label) {
        this.regionId =regionId;
        this.label = label;
    }

}

