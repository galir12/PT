package com.ptroaapp.gali.ptroaapp.Logic;

import com.ptroaapp.gali.ptroaapp.DM.LawDetails;
import com.ptroaapp.gali.ptroaapp.DM.LawSection;

import java.util.ArrayList;

/**
 * Created by Roey on 15/07/2016.
 */
public class LawManager {
    public static final ArrayList<LawDetails> GetLaws() {
        ArrayList<LawDetails> arr = new ArrayList<LawDetails>();
        LawDetails ld;
        LawSection ls,lsOne;
        ld = new LawDetails();
        ld.set_title("הגנה על בעלי חיים");
        ld.set_description("(חוק צער בעלי חיים) התשנ\"ד 1994");

        ls = new LawSection();
        ls.set_title("היתר הובלה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);
        //arr.add(ld);
        lsOne = new LawSection();
        lsOne.set_title("היתר כללי");
        lsOne.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(lsOne);


        arr.add(ld);


        ld = new LawDetails();
        ld.set_title("ניסויים בבעלי חיים");
        ld.set_description("(חוק צער בעלי חיים) התשנ\"ד 1994");
        ls = new LawSection();
        ls.set_title("Title 1.1");
        ls.set_description("bla bla bla 12345");
        ld.get_sections().add(ls);

        ls.set_title("בדיקה בדיקה");
        ls.set_description("ולום ארווס סאפיאן - פוסיליס קוויס, אקווזמן קוואזי במר מודוף. אודיפו בלאסטיק מונופץ קליר, בנפת נפקט למסון בלרק - וענוף מוסן מנת. להאמית קרהשק סכעיט דז מא, מנכם למטכין נשואי מנורך. גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, סחטיר בלובק. תצטנפל בלינדו למרקל אס לכימפו, דול, צוט ומעיוט - לפתיעם ברשג - ולתיעם גדדיש. קוויז דומור ליאמום בלינך רוגצה. לפמעט מוסן מנת. ושבע");
        ld.get_sections().add(ls);
        arr.add(ld);

        ld = new LawDetails();
        ld.set_title("הלעטת אווזים");
        ld.set_description("(חוק צער בעלי חיים) התשס\"א 2001");


        ls = new LawSection();
        ls.set_title("שורה ראשונה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);

        ls = new LawSection();
        ls.set_title("שורה שניה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);
        arr.add(ld);

        ld = new LawDetails();
        ld.set_title("תערוכות,הצגות ותחרויות");
        ld.set_description("(חוק צער בעלי חיים) התשס\"א 2001");

        ls = new LawSection();
        ls.set_title("שורה ראשונה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);

        ls = new LawSection();
        ls.set_title("שורה שניה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);
        arr.add(ld);

        ld = new LawDetails();
        ld.set_title("החזקת כלבים מסוכנים");
        ld.set_description("(הסדרת הפיקוח על כלבים) התשס\"ה 2004");

        ls = new LawSection();
        ls.set_title("שורה ראשונה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);

        ls = new LawSection();
        ls.set_title("שורה שניה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);
        arr.add(ld);

        ld = new LawDetails();
        ld.set_title("החזקה של עגלי חלב");
        ld.set_description("(הגנה על בעלי חיים) התשס\"ה 2006");

        ls = new LawSection();
        ls.set_title("שורה ראשונה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);

        ls = new LawSection();
        ls.set_title("שורה שניה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);
        arr.add(ld);

        ld = new LawDetails();
        ld.set_title("טיפול בחתולי רחוב");
        ld.set_description("הנחיות בעקבות פסק דין בגץ 02.06.2004");

        ls = new LawSection();
        ls.set_title("שורה ראשונה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);

        ls = new LawSection();
        ls.set_title("שורה שניה");
        ls.set_description("לורם איפסום דולור סיט אמט, קונסקטורר אדיפיסינג אלית גולר מונפרר סוברט לורם שבצק יהול, לכנוץ בעריר גק ליץ, ושבעגט ליבם סולגק. בראיט ולחת צורק מונחף, בגורמי מגמש. תרבנך וסתעד לכנו סתשם השמה - לתכי מורגם בורק? לתיג ישבעס");
        ld.get_sections().add(ls);
        arr.add(ld);









        /*for (int i =0;i<=10;i++) {
            ld = new LawDetails();
            ld.set_title("Law Demo " + i);
            ld.set_description("law demo description " + i);
            arr.add(ld);
        }
*/
        return arr;
    }
}
