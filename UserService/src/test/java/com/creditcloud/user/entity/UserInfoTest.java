/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.creditcloud.user.entity;

import com.creditcloud.model.enums.EthnicGroup;
import com.creditcloud.model.enums.Source;
import com.creditcloud.model.enums.user.info.CareerStatus;
import com.creditcloud.model.enums.user.info.CompanyIndustry;
import com.creditcloud.model.enums.user.info.CompanySize;
import com.creditcloud.model.enums.user.info.CompanyType;
import com.creditcloud.model.enums.user.info.EducationLevel;
import com.creditcloud.model.enums.user.info.MaritalStatus;
import com.creditcloud.model.enums.user.info.MonthlySalary;
import com.creditcloud.model.enums.user.info.YearOfService;
import com.creditcloud.user.entity.embedded.CareerInfo;
import com.creditcloud.user.entity.embedded.CompanyInfo;
import com.creditcloud.common.entities.embedded.info.Contact;
import com.creditcloud.common.entities.embedded.info.ContactInfo;
import com.creditcloud.common.entities.embedded.info.EducationInfo;
import com.creditcloud.user.entity.embedded.FinanceInfo;
import com.creditcloud.common.entities.embedded.info.PersonalInfo;
import com.creditcloud.common.entities.embedded.info.PlaceInfo;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * not simple a test, also show how to construct an object of UserInfo
 *
 * @author rooseek
 */
public class UserInfoTest {

    public UserInfoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testConstructor() {
        User user = new User("王二",
                             "wanger",
                             "42010619620204815X",
                             "15810101010",
                             "wang.er@gmail.com",
                             Source.BACK,
                             "employeeId",
                             "employeeId",
                             true, null, false);

        PersonalInfo personal = new PersonalInfo(true,
                                                 EthnicGroup.Han,
                                                 new Date(),
                                                 MaritalStatus.DIVORCED,
                                                 true,
                                                 new EducationInfo(EducationLevel.HIGHSCHOOL,
                                                                   "2007",
                                                                   "山东蓝翔技校"),
                                                 new PlaceInfo("安徽",
                                                               "合肥",
                                                               "北京",
                                                               "海淀",
                                                               "西直门",
                                                               "01062223333"),
                                                 null);
        FinanceInfo finance = new FinanceInfo(true,
                                              1,
                                              true,
                                              true,
                                              1,
                                              true);
        CareerInfo career = new CareerInfo(CareerStatus.EMPLOYEE,
                                           new CompanyInfo("云中信",
                                                           CompanyType.PRIVATE_ENTERPRISES,
                                                           CompanyIndustry.AGRICULTURE,
                                                           CompanySize.SIZE_10001_100000,
                                                           "01062222222",
                                                           "西直门"),
                                           "北京",
                                           "海淀",
                                           "经理",
                                           MonthlySalary.SALARY_10001_20000,
                                           YearOfService.YEAR_10_20,
                                           "wang.er@gmail.com");
        ContactInfo contact = new ContactInfo(new Contact("張三",
                                                          "父亲",
                                                          "13919840329"),
                                              new Contact("李四",
                                                          "同事",
                                                          "13512345678"),
                                              new Contact("李四",
                                                          "同事",
                                                          "13512345678"));

        UserInfo userInfo = new UserInfo(user,
                                         personal,
                                         finance,
                                         career,
                                         contact,
                                         null);
        assertNotNull(userInfo);
    }
}
