package one.digitalino.personapi.utils;

import one.digitalino.personapi.dto.request.PhoneDTO;
import one.digitalino.personapi.entity.Phone;
import one.digitalino.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "7598888-8888";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
    public static Phone createFakeEntity(){
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
