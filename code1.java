import java.util.Scanner;

public class Dai {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        //System.out.println("Enter 1 for to look up by Name and 2 to look up by Code");
       // int x = a.nextInt();
        //a.nextLine();
        String b = a.nextLine();
        String[] countryNames = {
            "afghanistan", "albania", "algeria", "american samoa", "andorra", "angola", "anguilla", "antarctica",
            "antigua and barbuda", "argentina", "armenia", "aruba", "australia", "austria", "azerbaijan", "bahamas",
            "bahrain", "bangladesh", "barbados", "belarus", "belgium", "belize", "benin", "bermuda", "bhutan", "bolivia, plurinational state of",
            "bonaire, sint eustatius and saba", "bosnia and herzegovina", "botswana", "bouvet island", "brazil",
            "british indian ocean territory", "brunei darussalam", "bulgaria", "burkina faso", "burundi", "cambodia", "cameroon",
            "canada", "cape verde", "cayman islands", "central african republic", "chad", "chile", "china", "christmas island",
            "cocos (keeling) islands", "colombia", "comoros", "congo", "congo, the democratic republic of the", "cook islands",
            "costa rica", "croatia", "cuba", "curaçao", "cyprus", "czech republic", "côte d'ivoire", "denmark", "djibouti",
            "dominica", "dominican republic", "ecuador", "egypt", "el salvador", "equatorial guinea", "eritrea", "estonia",
            "eswatini", "ethiopia", "falkland islands (malvinas)", "faroe islands", "fiji", "finland", "france", "french guiana",
            "french polynesia", "french southern territories", "gabon", "gambia", "georgia", "germany", "ghana", "gibraltar",
            "greece", "greenland", "grenada", "guadeloupe", "guam", "guatemala", "guernsey", "guinea", "guinea-bissau",
            "guyana", "haiti", "heard island and mcdonald islands", "holy see (vatican city state)", "honduras", "hong kong",
            "hungary", "iceland", "india", "indonesia", "iran, islamic republic of", "iraq", "ireland", "isle of man",
            "israel", "italy", "jamaica", "japan", "jersey", "jordan", "kazakhstan", "kenya", "kiribati",
            "korea, democratic people's republic of", "korea, republic of", "kuwait", "kyrgyzstan", "lao people's democratic republic",
            "latvia", "lebanon", "lesotho", "liberia", "libya", "liechtenstein", "lithuania", "luxembourg", "macao",
            "macedonia, the former yugoslav republic of", "madagascar", "malawi", "malaysia", "maldives", "mali", "malta",
            "marshall islands", "martinique", "mauritania", "mauritius", "mayotte", "mexico", "micronesia, federated states of",
            "moldova, republic of", "monaco", "mongolia", "montenegro", "montserrat", "morocco", "mozambique", "myanmar",
            "namibia", "nauru", "nepal", "netherlands", "new caledonia", "new zealand", "nicaragua", "niger", "nigeria", "niue",
            "norfolk island", "northern mariana islands", "norway", "oman", "pakistan", "palau", "palestine, state of",
            "panama", "papua new guinea", "paraguay", "peru", "philippines", "pitcairn", "poland", "portugal", "puerto rico",
            "qatar", "romania", "russian federation", "rwanda", "réunion", "saint barthélemy", "saint helena, ascension and tristan da cunha",
            "saint kitts and nevis", "saint lucia", "saint martin (french part)", "saint pierre and miquelon",
            "saint vincent and the grenadines", "samoa", "san marino", "sao tome and principe", "saudi arabia", "senegal",
            "serbia", "seychelles", "sierra leone", "singapore", "sint maarten (dutch part)", "slovakia", "slovenia",
            "solomon islands", "somalia", "south africa", "south georgia and the south sandwich islands", "south sudan",
            "spain", "sri lanka", "sudan", "suriname", "svalbard and jan mayen", "sweden", "switzerland", "syrian arab republic",
            "taiwan, province of china", "tajikistan", "tanzania, united republic of", "thailand", "timor-leste", "togo",
            "tokelau", "tonga", "trinidad and tobago", "tunisia", "turkey", "turkmenistan", "turks and caicos islands", "tuvalu",
            "uganda", "ukraine", "united arab emirates", "united kingdom", "united states", "united states minor outlying islands",
            "uruguay", "uzbekistan", "vanuatu", "venezuela, bolivarian republic of", "viet nam", "virgin islands, british",
            "virgin islands, u.s.", "wallis and futuna", "western sahara", "yemen", "zambia", "zimbabwe", "åland islands"
        };

        String[] countryCodes = {
            "AF", "AL", "DZ", "AS", "AD", "AO", "AI", "AQ", "AG", "AR", "AM", "AW", "AU", "AT", "AZ", "BS", "BH", "BD", "BB", "BY",
            "BE", "BZ", "BJ", "BM", "BT", "BO", "BQ", "BA", "BW", "BV", "BR", "IO", "BN", "BG", "BF", "BI", "KH", "CM", "CA", "CV",
            "KY", "CF", "TD", "CL", "CN", "CX", "CC", "CO", "KM", "CG", "CD", "CK", "CR", "HR", "CU", "CW", "CY", "CZ", "CI", "DK",
            "DJ", "DM", "DO", "EC", "EG", "SV", "GQ", "ER", "EE", "SZ", "ET", "FK", "FO", "FJ", "FI", "FR", "GF", "PF", "TF", "GA",
            "GM", "GE", "DE", "GH", "GI", "GR", "GL", "GD", "GP", "GU", "GT", "GG", "GN", "GW", "GY", "HT", "HM", "VA", "HN", "HK",
            "HU", "IS", "IN", "ID", "IR", "IQ", "IE", "IM", "IL", "IT", "JM", "JP", "JE", "JO", "KZ", "KE", "KI", "KP", "KR", "KW",
            "KG", "LA", "LV", "LB", "LS", "LR", "LY", "LI", "LT", "LU", "MO", "MK", "MG", "MW", "MY", "MV", "ML", "MT", "MH", "MQ",
            "MR", "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MS", "MA", "MZ", "MM", "NA", "NR", "NP", "NL", "NC", "NZ", "NI",
            "NE", "NG", "NU", "NF", "MP", "NO", "OM", "PK", "PW", "PS", "PA", "PG", "PY", "PE", "PH", "PN", "PL", "PT", "PR", "QA",
            "RO", "RU", "RW", "RE", "BL", "SH", "KN", "LC", "MF", "PM", "VC", "WS", "SM", "ST", "SA", "SN", "RS", "SC", "SL", "SG",
            "SX", "SK", "SI", "SB", "SO", "ZA", "GS", "SS", "ES", "LK", "SD", "SR", "SJ", "SE", "CH", "SY", "TW", "TJ", "TZ", "TH",
            "TL", "TG", "TK", "TO", "TT", "TN", "TR", "TM", "TC", "TV", "UG", "UA", "AE", "GB", "US", "UM", "UY", "UZ", "VU", "VE",
            "VN", "VG", "VI", "WF", "EH", "YE", "ZM", "ZW", "AX"
        };
        
        if(b.length()==2){
        LookCode(b,countryNames,countryCodes);
        }
        else{
        LookName(b,countryNames,countryCodes);
        }
        
    }

    public static void LookName(String x,String[] a, String[] b) {
        //Scanner Scan = new Scanner(System.in);
        //System.out.println("Enter Name of Country:");
        //String c = Scan.nextLine().trim()
        String xx=x.toLowerCase();
        int d=1;
        for (int i = 0; i < a.length; i++) {
            if(xx.equals(a[i])){
              System.out.print(b[i]) ;
              d=0;
              break;
            }
        }
        if(d!=0){
            System.out.println("Not Found");
        }
    }

    public static void LookCode(String x,String[] a, String[] b) {
        //Scanner Scan = new Scanner(System.in);
        //System.out.println("Enter Code of Country:");
        //String c = Scan.nextLine().trim()
        String xx=x.toUpperCase();
        int d=1;
        for (int i = 0; i < b.length; i++) {
            if(xx.equals(b[i])){
              System.out.print(a[i]) ;
              d=0;
              break;
            }
        }
        if(d!=0){
            System.out.println("Not Found");
        }
    }
}            
