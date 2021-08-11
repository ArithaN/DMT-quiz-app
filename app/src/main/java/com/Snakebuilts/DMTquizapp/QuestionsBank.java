package com.Snakebuilts.DMTquizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> නීතිQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1  = new QuestionsList("වාහන ඉස්සර කිරීමේදී අනුගමනය කළ යුත්තේ,", "3,4 වැනි වැඩි ගියරයක් තෝරා ගැනීම මඟින් වැඩි වේගයක් ලබාදීම.", "1,2 වැනි අඩු ගියරයක් තෝරා ගැනීම මඟින් වැඩි බලයක් ලබාදීම", "1,2 වැනි අඩු ගියරයක් තෝරා ගැනීම මඟින් අඩු බලයක් ලබාදීම", "3,4 වැනි වැඩි ගියරයක් තෝරා ගැනීම මඟින් වැඩි බලයක් ලබා දීම", "3,4 වැනි වැඩි ගියරයක් තෝරා ගැනීම මඟින් වැඩි වේගයක් ලබාදීම");
        final QuestionsList question2  = new QuestionsList("පදික මාරුවක් ඇති විට,", "මීටර් 25ක් ඇතුළත ඕනෑම ස්ථානයකින් පදිකයන්ට මාරු විය හැකිය", "මීටර් 50ක් ඇතුළත ඕනෑම ස්ථානයකින් පදිකයන්ට මාරු විය හැකිය", "මීටර් 50ක් ඇතුළත ඕනෑම ස්ථානයකින් පදිකයන්ට මාරු විය නොහැක", "පදික මාරුව හරහා පමණක් පදිකයන්ට මාරුවිය හැක.", "පදික මාරුව හරහා පමණක් පදිකයන්ට මාරුවිය හැක.");
        final QuestionsList question3  = new QuestionsList("ඔබ ගමන් කරන මාර්ගයේ ඉදිරිය නොපෙනෙන වංගුවක් ඇති විට ඔබ කළ යුත්තේ", "වාහනය හැම විටම මාර්ගය මැදින් ගමන් කිරීමය", "වාහනයේ නළාව ශබ්ද නොකර වේගයෙන් යාමය", "නතර කිරීමට බලාපොරොත්තුවෙන් වේගය අඩුකර වරක් නළාව ශබ්ද කරගෙන යාමය", "පැමිණි වේගයෙන්ම නළාව ශබ්ද කරගෙන යාමය", "නතර කිරීමට බලාපොරොත්තුවෙන් වේගය අඩුකර වරක් නළාව ශබ්ද කරගෙන යාමය");
        final QuestionsList question4  = new QuestionsList("පාරේ මැද සුදු ඉරක් ඇති විට,", "සුදු ඉර කැපෙන සේ ඉස්සර කිරීම තහනම්ය", "දකුණට හැරවීම තහනම්ය", "මාර්ගය බෙදීමට ඉර යොදා ඇත", "වංගුවක අවදානම පෙන්වීම සඳහා යොදාගෙන ඇත", "සුදු ඉර කැපෙන සේ ඉස්සර කිරීම තහනම්ය");
        final QuestionsList question5  = new QuestionsList("පාරේ මැද එක ළඟින් වූ සුදු ඉරි 2ක් ඇති විට", "දකුණට හැරවීමට හැකිය", "ඉස්සර කිරීමට පුළුවන", "දකුණට හැරවීමට හෝ ඉසසර කිරීම කළ හැක", "ඉරි කැපෙන සේ ඉස්සර කිරීම හෝ දකුණට හැරවීම තහනම්ය", "ඉරි කැපෙන සේ ඉස්සර කිරීම හෝ දකුණට හැරවීම තහනම්ය");
        final QuestionsList question6  = new QuestionsList("මෝටර් වාහනයක ඉදිරිපස බෆරය මත ලෝහමය ආරක්ෂක වැටක් සවි කිරීම", "නීත්\u200Dයානුකූල නොවේ", "හදිසි අනතුරක දී අනෙක් පාර්ශ්වයට සිදුවන හානිය වැඩි  වේ", "රියැදුරුගේ දර්ශනයට බාධා ඇති වේ", "ඉදිරිපස බෆරය ගැලවී යාමට ඉඩ ඇත", "නීත්\u200Dයානුකූල නොවේ");
        final QuestionsList question7  = new QuestionsList("රියැදුරු විසින් වාහනයක් පදවන සෑම විටම තම රියැදුරු බලපත්\u200Dරය තමා සන්තකයේ තබා ගැනීම", "නිතිමය අවශ්\u200Dයතාවකි", "ඡායා පිටපතක් තබා ගැනීම ප්\u200Dරමාණවත් වේ", "අවශ්\u200Dය විටෙක ඉදිරිපත් කිරීමට හැකි වන පරිදි නිවසේ තබා ගැනීම වඩා ආරක්ෂාකාරී වේ", "නීතිමය අවශයතාවක් නොවේ", "නිතිමය අවශ්\u200Dයතාවකි");
        final QuestionsList question8  = new QuestionsList("තම වාහනයට ඉදිරියෙන් ගමන් කරන වාහනයක් වම් පසින් පසුකර යා හැකි වන්නේ", "ඉදිරියෙන් ගමන් කරන වාහනය දකුණට හරවන වාහනයක් බවට සංඥා කොට ඇති විටයි", "වම් පසින් පසුකර යෑම ආරක්ෂා සහිත බව හැඟෙන විටයි", "ඉහත කුමන අවස්ථාවකදී වුවද වම් පසින් යා හැකි", "වම් පසින් ඉස්සර කිරිම සම්පූර්ණයෙන් තහනම්", "ඉදිරියෙන් ගමන් කරන වාහනය දකුණට හරවන වාහනයක් බවට සංඥා කොට ඇති විටයි");
        final QuestionsList question9  = new QuestionsList("වෙනත් වාහනයක් ඉස්සර කිරීමේ දී පළමුව කළ යුත්තේ", "වාහන දකුණු පසට ගැනීමයි", "මගේ වාහනය වාහනයේ වේගය අඩු කිරීමයි", "කණ්ණාඩියෙන් පසුපස බැලිමියි", "වාහනයේ නලාව ශබ්ද කිරීමයි", "කණ්ණාඩියෙන් පසුපස බැලිමියි");
        final QuestionsList question10 = new QuestionsList("රිය අනතුරකින් පොලිස් ස්ථානයට වාර්තා  කිරීම සඳහා දී  ඇති උපරිම කාල සීමාව", "පැය 12", "පැය  36", "පැය 24", "පැය 48", "පැය 24");
        final QuestionsList question11 = new QuestionsList("යාමට සූදානම් වීම සඳහා ආලෝක සංඥාවල", "කහ පාට පහන් දැල්වේ", "කහ පාට සමඟ කොළ පාට පහන් දැල්වේ", "රතු පාට පහන් දැල්වේ", "කොළ පාට පහන් දැල්වේ", "කහ පාට සමඟ කොළ පාට පහන් දැල්වේ");
        final QuestionsList question12 = new QuestionsList("'වට වංගු' නීතියෙන් මූලික අරුත වනුයේ,", "තමන්ට දකුණු පසින් එන අයට ඉඩ දීමයි", "වමෙන් එන අයට ඉඩ දිය යුතුය", "පාරේ තමන්ට දෙපසින් එන අයට ඉඩ දීමයි", "සෑම විටම වම් පසින් වට රවුමට ඇතුළු වීමයි", "තමන්ට දකුණු පසින් එන අයට ඉඩ දීමයි");
        final QuestionsList question13 = new QuestionsList("වට වංගුවක් කරා එන විට ඉදිරියෙන් කහ පැහැ පහන දැල්වුවහොත්", "දකුණින් එන අයට ඉඩ දිය යුතුය", "වමෙන් එන අයට ඉඩ දිය යුතුය", "ආලෝක සංඥා විධානයට අවනත විය යුතුය", "අලෝක සංඥා මඟින් පාලනය නොකරයි", "ආලෝක සංඥා විධානයට අවනත විය යුතුය");
        final QuestionsList question14 = new QuestionsList("වට වංගුවක් කරා එන විට ඉදිරියෙන් කහ පැහැ ආලෝක සංඥා ව නිවෙමින්, දැල්වෙමින් පැවතුණහොත්", "කෙලින්ම ඉදිරියට යා යුතුය", "වට වංගුවේ නීතීය අනුගමනය කළ යුතුය ", "වට වංගුවේ නීතීය එවිට ක්\u200Dරියාත්මක වන්නේ නැත", "වට වංගුව කෙරෙහි ඔබගේ වැඩි අවධානය ලබා ගැනීම සඳහා යොදා ඇත", "වට වංගුවේ නීතීය අනුගමනය කළ යුතුය ");
        final QuestionsList question15 = new QuestionsList("වාහනයක් මාර්ගයේ අනතුරකට පත් වූ විටක", "එම වාහනය එම ස්ථානයේම තැබිය යුතුය", "අන් වාහනවලට අවහිර වීම වළකා මාර්ගයෙන් අයින් කිරීම සඳහා අවසර ඇත", "එම වාහනයේ පිහිටීම සලකුණු කොට රෝගීන් ප්\u200Dරවාහනය කිරීම සඳහා අවසර ඇත", "කිසිම හේතුවක් නිසාවත් වාහනය ඉවත් කළ නොහැක .", "එම වාහනයේ පිහිටීම සලකුණු කොට රෝගීන් ප්\u200Dරවාහනය කිරීම සඳහා අවසර ඇත");
        final QuestionsList question16 = new QuestionsList("වාහනයක් ධාවනයේදී මීටර් පුවරුවේ රතු බල්බයක් දැල්වේ නම්", "වාහනය ගමනාන්තය දක්වා ප්\u200Dරවේශමෙන් ධාවනය කිරීම සුදුසුය", "විශේෂ අවධානයක් යොමු කිරීම අවශ්\u200Dය නොවේ", "වාහනය වහාම නතර කර දෝෂය කුමක් දැයි තහවුරු කරගත යුතුය", "ආසන්නයේ ඇති ගරාජයට ධාවනය කළ යුතුය", "වාහනය වහාම නතර කර දෝෂය කුමක් දැයි තහවුරු කරගත යුතුය");
        final QuestionsList question17 = new QuestionsList("මහා මාර්ගයේ ධාවනය කිරීමට සුදුසු වාහනයක් යනු", "වලංගු ආදායම් බලපත්\u200Dරය හා රක්ෂණ සහතිකය පමණක් තිබිය යුතුය", "සුක්කානම,තිරිංග හා ටයර් පමණක් මනා තත්ත්වයෙන් තිබිය යුතුය", "රියැදුරාට පාලනය කරගත හැකි නම් කුමන වාහනයක් වුවද ධාවනය කළ හැකිය", "එහි සියලුම අංග මනා කාර්මික තත්ත්වයෙන් යුතු බව, රක්ෂණ සහතිකය,ආදායම් බලපත්\u200Dරය සමඟ අවශ්\u200Dය ලේඛන තිබිය යුතුය", "එහි සියලුම අංග මනා කාර්මික තත්ත්වයෙන් යුතු බව, රක්ෂණ සහතිකය,ආදායම් බලපත්\u200Dරය සමඟ අවශ්\u200Dය ලේඛන තිබිය යුතුය");
        final QuestionsList question18 = new QuestionsList("ආලෝක සංඥා මඟින් පාලනය වන මංසන්ධි කොටුව සලකුණු කර ඇත්තේ", "මංසන්ධියෙන් දකුණට හැරවීම හැර ඕනෑම අවස්ථාවක ඇතුළුවීමට", "මංසන්ධිය කෙරෙහි අවධානය වැඩි කිරීමට", "කොළ පැහැති ආලෝකය දැල්වූවත් මංසන්ධි කොටුවෙන් පිටවීමට නොහැකි නම් දකුණට හරවන වාහන හැර අනිත් කිසිදු වාහනයක් ඇතුළු නොකිරීමට", "මංසන්ධියක නිතරම වාහන තදබද ඇති බව දැන්වීම්ට", "කොළ පැහැති ආලෝකය දැල්වූවත් මංසන්ධි කොටුවෙන් පිටවීමට නොහැකි නම් දකුණට හරවන වාහන හැර අනිත් කිසිදු වාහනයක් ඇතුළු නොකිරීමට");
        final QuestionsList question19 = new QuestionsList("ස්වයංක්\u200Dරීය ගියර නොවන වාහනයක් තැනිතලා බිමක ගමන් ආරම්භක ක්\u200Dරියාවලියේ අවසාන මොහොතේ දී දෙපා තිබිය යුතු අයුරු,", "දකුණු පාදය බිම් තහඩුවේ සහ වම් පාදය ක්ලච් පැඩලයේ", "දකුණු පාදය ඇක්සලේටරයේ සහ වම් පාදය බිම් තහඩුවේ.", "දකුණු පාදය තිරිංග පැඩලයේ සහ වම් පාදය ක්ලච් පැඩලයේ.", "දකුණු පාදය තිරිංග පැඩලයේ සහ වම් පාදය බිම් තහඩුවේ", "දකුණු පාදය ඇක්සලේටරයේ සහ වම් පාදය බිම් තහඩුවේ.");
        final QuestionsList question20 = new QuestionsList("ස්වයංක්\u200Dරීය ගියර් නොවන වාහනයක් සාමාන්\u200Dය තැනිතලා නිදහස් මාර්ගයේ ධාවනයේදී දෙපා තිබිය යුතු අයුරු", "වම් පාදය බිම් තහඩුවේ සහ දකුණු පාදය ඇක්ස්ලේටරයේ", "වම් පාදය තිරිංග පැඩලයේ යාන්තමට සහ දකුණු පාදය ඇක්සලේටරයේ", "වම් පාදයේ ක්ලච් පැඩලයේ යාන්තමට සහ දකුණු පාදය තිරිංග පැඩලයේ", "වම් පාදයේ ක්ලච් පැඩලයේ යාන්තමට සහ දකුණු පාදය ඇක්සලේටරයේ", "වම් පාදය බිම් තහඩුවේ සහ දකුණු පාදය ඇක්ස්ලේටරයේ");
        final QuestionsList question21 = new QuestionsList("පහළට බෑවුමක දී පිටුපසට පදවන ස්වයංක්\u200Dරීය ගියර නොවන වාහනයක දී දෙපා තිබිය යුතු අයුරු,", "දකුණු පාදය බිම් තහඩුවේ සහ වම් පාදය ක්ලච් පැඩලයේ", "දකුණු පාදය තිරිංග පැඩලයේ සහ වම් පාදය බිම් තහඩුවේ", "වම් පාදය ක්ලච් පැඩලයේ යාන්තමට සහ දකුණු පාදය ඇක්සලේටරයේ", "වම් පාදය ක්ලච් පැඩලයේ සහ දකුණු පාදය තිරිංග පැඩලයේ", "වම් පාදය ක්ලච් පැඩලයේ සහ දකුණු පාදය තිරිංග පැඩලයේ");
        final QuestionsList question22 = new QuestionsList("මෝටර් රථයක ක්ලච් එක ලිස්සීම දැකගත හැකි වන්නේ", "ගියර් දැමීමට නොහැකි වීමෙන්", "ගියර් දැමීමේ දී ශබ්දයක් ඇසීමෙන්.", "ගියර් යොදා ක්ලචය එන්ජිමට සම්බන්ද කිරිමේ දී එන්ජිම වැඩිපුර රේස් වීමෙන්", "ක්ලචය නිදහස් කිරීමේ දී වාහනය දෙදරීමෙන්.", "ගියර් යොදා ක්ලචය එන්ජිමට සම්බන්ද කිරිමේ දී එන්ජිම වැඩිපුර රේස් වීමෙන්");
        final QuestionsList question23 = new QuestionsList("ධාවන තීරු තුනකින් යුතු මාර්ගයක තුන්වන තීරුව භාවිතා කළ යුත්තේ,", "අධික වේගයකින් ධාවනය කිරීම සඳහාය.", "වෙනත් වාහනයක් පසුකර යෑමටය.", "වෙනත් වාහනයක් පසුකර යෑමට හෝ දකුණට හැරවීමට හෝ අනතුරක් වළක්වා ගැනීමටය.", "දකුණට හැරවීමටය", "වෙනත් වාහනයක් පසුකර යෑමට හෝ දකුණට හැරවීමට හෝ අනතුරක් වළක්වා ගැනීමටය");
        final QuestionsList question24 = new QuestionsList("ප්\u200Dරධාන මාර්ගයට ඇතුළු වීමේ දී ඔබ ඉඩ දිය යුත්තේ", "දකුණෙන් එන වාහනවලට ය", "දකුණෙන් සහ වමෙන් එන වාහනවලට ය", "ඉදිරියෙන්  එන වාහනවලට ය", "වමෙන් එන වාහනවලට ය", "දකුණෙන් සහ වමෙන් එන වාහනවලට ය");
        final QuestionsList question25 = new QuestionsList("ඉස්සර කිරීම නොකළ යුත්තේ", "රෝහලක ඉදිරියෙන් ඇති අවස්ථාවක ය", "පාර මැද සුදු පාට කඩ ඉරි ඇති අවස්ථාවකය", "කන්දක මුදුනක් ඇති අවස්ථාවක ය", "පාසලක් ඉදිරියෙන් ඇති අවස්තාවක ය", "කන්දක මුදුනක් ඇති අවස්ථාවක ය");
        final QuestionsList question26 = new QuestionsList("රාත්\u200Dරී කාලයේ ධාවනයේදී ඉදිරියෙන් එන වාහනයේ ප්\u200Dරධාන පහන් ආලෝකය අඩු (අවපාත) නොකළ විට ඔබ කළ යුත්තේ,", "වහාම ප්\u200Dරධාන පහන් ආලෝකය වැඩිකර ගැනීමයි", "වාහනයේ වේගය අඩුකර ගැනීමයි", "වාහනයේ වේගය අඩුකර ගැනීම හෝ නවත්වා ගැනීමට ක්\u200Dරියා කිරීමයි", "වාහනයේ පහන් වහාම නිවා දැමීමයි", "වාහනයේ වේගය අඩුකර ගැනීම හෝ නවත්වා ගැනීමට ක්\u200Dරියා කිරීමයි");
        final QuestionsList question27 = new QuestionsList("වාහනයක තිරිංග යෙදීමේ දී වම් පැත්තට ඇදී යන්නේ නම් එයින් අදහස් වනුයේ", "ඉදිරිපස වම් පැත්තේ රෝදයේ තිරිංග තෙල් කාන්දු වීමයි", "ඉදිරිපස දකුණු පැත්තේ රෝදයේ තිරිංග තෙල් කාන්දු වීමයි.", "පසුපස රෝදවලට තිරිංග නොමැති බවයි.", "රෝදවල වායු පීඩනය එකිනෙකට වෙනස් බවයි.", "ඉදිරිපස දකුණු පැත්තේ රෝදයේ තිරිංග තෙල් කාන්දු වීමයි.");
        final QuestionsList question28 = new QuestionsList("වාහනයක් පිටුපසට පැදවීමේදී අනුගමනය කළ යුතු ක්\u200Dරියා මාර්ගය පිළිවෙලින්,", "තමාට රිසි සේ වාහනය පිටුපසට පැදවිය හැකිය", "වාහනය පාර අයිනට සමාන්තරව නවත්වා අතුරු මාර්ගයේ අවම දුරින් පිටුපසට පැදවීමයි", "වාහනය පාර අයිනට සමාන්තර නොවන සේ නවත්වා අතුරු මාර්ගයේ අවම දුරින් පිටුපසට පැදවීමයි", "වැඩි ගියරයක් තෝරා ගැනීම මඟින් වැඩි බලයක් ලබා දීමයි", "වාහනය පාර අයිනට සමාන්තරව නවත්වා අතුරු මාර්ගයේ අවම දුරින් පිටුපසට පැදවීමයි");
        final QuestionsList question29 = new QuestionsList("පදික මාරුව හඟවන සංඥා පුවරුව දුටු විට කළ යුත්තේ", "පදිකයකු සිටීදැයි පරීක්ෂා කිරීමයි", "කහ ඉරට මෙපිටින් වාහනය නවත්වා ගැනීමයි", "වාහනයේ වේගය අඩු කර ගැනීමයි", "මාර්ග තදබද ඇති විට පමණක් සැලකිලිමත් විය යුතුය", "වාහනයේ වේගය අඩු කර ගැනීමයි");
        final QuestionsList question30 = new QuestionsList("අවධානම හැඟවෙන පහන් දැල්විය යුත්තේ", "හතරමං හන්දියක කෙළින් ගමන් කරන විටය", "අවදානම් ස්ථානයක දී වාහනයකට ඉස්සර කරන විටයි", "මහා මාර්ගයේ ආපදාවකට ලක් වූ වාහනයක් නවතා තබන විට දී පමණි", "රෝගියෙකු ප්\u200Dරවාහනය කරන අවස්ථාවේදී", "මහා මාර්ගයේ ආපදාවකට ලක් වූ වාහනයක් නවතා තබන විට දී පමණි");
        final QuestionsList question31 = new QuestionsList("මහා මාර්ගෝපදේශ සංග්\u200Dරහයේ අන්තුරු හැඟවීමේ සංඥාවල වර්ණය වනුයේ,", "රතු, සුදු හා නිල් පැහැය", "සුදු පසුතලයේ රතු පැහැය", "කහ පසුතලයේ කළු පැහැය", "රතු, සුදු හා කළු පැහැය", "කහ පසුතලයේ කළු පැහැය");
        final QuestionsList question32 = new QuestionsList("රථ වාහන ආලෝක සංඥාවල කොළ බල්බය දැල්වේ නම් ඊළඟ අවස්ථාව වනුයේ", "කොළ තිබිය දී කහ පැහැය දැල්වීමයි", "කොළ නිවීගොස් රතු පැහැය දැල්වීමයි", "කොළ නිවීගොස් කහ පැහැය දැල්වීමයි", "කොළ නිවී රතු හා කහ එකවර දැල්වීමයි", "කොළ නිවීගොස් කහ පැහැය දැල්වීමයි");
        final QuestionsList question33 = new QuestionsList("රථ වාහන ආලෝක සංඥාවල රතු බල්බය දැල්වේ නම් ඊළඟ අවස්ථාව වනුයේ,", "රතු නිවීගොස් කහ බල්බය දැල්වීමයි.", "රතු එසේම තිබිය දී කහ බල්බය දැල්වීමයි.", " රතු නිවීගොස් කොළ බල්බය දැල්වීමයි.", " රතු නිවී කොළ හා කහ බල්බ එකවර දැල්වීමයි.", "රතු එසේම තිබිය දී කහ බල්බය දැල්වීමයි.");
        final QuestionsList question34 = new QuestionsList("වාහනය නවතා තැබීමේ දී ඔබ කළ යුතු වැදගත් කාර්යයක් වන්නේ,", " නවතා තැබීමේ දී තිරිංග නිසි පරිදී යෙදීමයි", "දිවා කාලයේ වුවද නැවතීමේ පහන් දල්වා තිබීම", "ඉදිරි රෝද සම්පූර්ණයෙන් වමට හරවා තබා නවතා තැබීම", "වාහනයේ දොර අඟුළු හොදින් දමා තිබීමයි", "නවතා තැබීමේ දී තිරිංග නිසි පරිදී යෙදීමයි");
        final QuestionsList question35 = new QuestionsList("ඔබ පදවන වාහනයේ බැටරිය ආරෝපණය  (චාජ්)නොවන බවට දන්වන බල්බය එක විට දැල්වුණේ නම් ඔබ විසින් කළ යුත්තේ,", "ඕල්ටනේටරයේ හෝ ඩයිනමෝව කරකැවීමට ඇති බෙල්ට් එක පරික්ෂා කළ යුතුය.", "වාහනයේ බැටරිය පරික්ෂා කළ යුතුයි.", "වාහනය නතර කර විදුලි කාර්මිකයකු රැගෙන ආ යුතුය.", "විලායක (ෆියුස් ) පරික්ෂා කළ යුතුය.", "ඕල්ටනේටරයේ හෝ ඩයිනමෝව කරකැවීමට ඇති බෙල්ට් එක පරික්ෂා කළ යුතුය.");
        final QuestionsList question36 = new QuestionsList("තිරිංග තෙල් භාවිත කරන වාහනයක තිරිංග පැඩලය පහතටම බැසිමක් සිදු වේ නම් ඉන් අදහස් වනුයේ ", "බ්\u200Dරේක් බයින්ඩ් ( තිරිංග හිර වීමක් )ඇති බවයි.", "තිරිංග නිසි පරිදි ක්\u200Dරියා කරන බවයි.", "තිරිංග තෙල් කාන්දු වීමක් ඇති බවයි", "තිරිංග පැඩලයේ දෝෂයක් ඇති බවයි.", "තිරිංග තෙල් කාන්දු වීමක් ඇති බවයි");
        final QuestionsList question37 = new QuestionsList("වාහනයක් ධාවනය කිරිමේ දී ගියර් මාරු කිරීමේ අපහසුතාවයක් ඇත්නම් වඩාත්ම විය හැක්කේ", "ක්ලච් එක නිසි පරිදි ක්\u200Dරියා නොකිරීමයි.", "එන්ජිමේ වේගය නිසි පරිදි නොමැති වීමයි", "ගියර් පෙට්ටියේ දෝෂයක් ඇති බවයි.", "වාහනයේ ගියර් ලීවරයේ දෝෂයක් ඇති බවයි.", "ක්ලච් එක නිසි පරිදි ක්\u200Dරියා නොකිරීමයි.");
        final QuestionsList question38 = new QuestionsList("වාහනයේ ටයර්වල හුළං නියමිත ප්\u200Dරමාණයට වඩා වැඩි වු විට,", "ටයරය ඉක්මනින් ගෙවී යයි.", "ටයරයේ මැද ඉක්මනින් ගෙවී යයි.", "ටයරයේ දෙපැත්ත ඉක්මනින් ගෙවී යයි.", "ටයරයේ තැනින් තැන වැඩි වැඩියෙන් ගෙවී යයි.", "ටයරයේ මැද ඉක්මනින් ගෙවී යයි.");
        final QuestionsList question39 = new QuestionsList("වාහනයක් ඉස්සර කිරීමේ දී අනුගමනය කළ යුත්තේ,", "3,4 වැනි ගියරයක් තෝරා  ගැනීම මගින් වැඩි වේගයක් ලබා ගැනීම.", "1,2 වැනි අඩු ගියරයක් තෝරා ගැනීම මගින් වැඩි බලයක් දීම.", "1,2 වැනි අඩු ගියරයක් තෝරා ගැනීම මගින් අඩු බලයක් ලබා දීම.", "3,4 වැනි ගියරයක් තෝරා ගැනීම මගින් වැඩි බලයක් ලබා දීම.", "3,4 වැනි ගියරයක් තෝරා  ගැනීම මගින් වැඩි වේගයක් ලබා ගැනීම.");
        final QuestionsList question40 = new QuestionsList("", "", "", "", "", "");



        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);
        questionsLists.add(question21);
        questionsLists.add(question22);
        questionsLists.add(question23);
        questionsLists.add(question24);
        questionsLists.add(question25);
        questionsLists.add(question26);
        questionsLists.add(question27);
        questionsLists.add(question28);
        questionsLists.add(question29);
        questionsLists.add(question30);
        questionsLists.add(question31);
        questionsLists.add(question32);
        questionsLists.add(question33);
        questionsLists.add(question34);
        questionsLists.add(question35);
        questionsLists.add(question36);
        questionsLists.add(question37);
        questionsLists.add(question38);
        questionsLists.add(question39);
        questionsLists.add(question40);

        return questionsLists;
    }

    private static List<QuestionsList> මාර්ගසංඥාQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question2 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question3 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question4 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question5 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question6 = new QuestionsList("", "", "", "", "", "");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> අනෙකුත්සංඥාQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question2  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question3  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question4  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question5  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question6  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question7  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question8  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question9  = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question10 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question11 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question12 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question13 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question14 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question15 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question16 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question17 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question18 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question19 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question20 = new QuestionsList("", "", "", "", "", "");
        final QuestionsList question21 = new QuestionsList("", "", "", "", "", "");



        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);
        questionsLists.add(question21);

        return questionsLists;
    }

    private static List<QuestionsList> බරවාහනQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1  = new QuestionsList("වාහනයේ ටයරවල සුළං නියමිත ප්\u200Dරමාණයට වඩා අඩු වූ විට", "ටයරයේ දෙපැත්ත ඉක්මනින් ගෙවී යයි", "ටයරය ඉක්මනින් ගෙවී යයි", "ටයරය මැද ඉක්මනින් ගෙවී යයි", "ටයරය තැනින් තැන වැඩියෙන් ගෙවී යයි", "ටයරයේ දෙපැත්ත ඉක්මනින් ගෙවී යයි");
        final QuestionsList question2  = new QuestionsList("වාහනයක ඉන්ධන දහනය අධික වීමට වඩාත් බලපෑ හැක්කේ", "දුර්වල සුක්කානම් පාලනය", "වංගුවදී ත්වරණය කිරීම", "රළු ලෙස තිරිංග යෙදීම සහ ත්වරණය කිරීම", "ඉහළ ගියරවල ධාවනය", "ඉහළ ගියරවල ධාවනය");
        final QuestionsList question3  = new QuestionsList("ස්වයංක්\u200Dරීය නොවන ගියර් පෙට්ටියක් ඇති වාහනයක ගියර් මාරු කිරීමේ අපහසුතාවයක් ඇත්නම් වඩාත්ම හේතු වන්නේ", "එන්ජිමේ ක්\u200Dරියාකාරිත්වය සුමට නොවීම", "වාහනයේ ඩිපරන්සලය දෝෂ සහිත වීම", "ක්ලච් එක නිසි පරිදි ක්\u200Dරියා නොකිරීම", "ගියර් පෙට්ටියේ ඇති රෝද කැඩී තිබීම", "ක්ලච් එක නිසි පරිදි ක්\u200Dරියා නොකිරීම");
        final QuestionsList question4  = new QuestionsList("ඔබ පදවන වාහනයේ බැටරි ආරෝපණය (චාජ් - charge) නොවන බවට දන්වන බල්බය එකවිට දැල්වුනේ නම් ඔබ විසින් මුලින්ම කළ යුත්තේ,", "වාහනයේ බැටරිය පරීක්ෂා කළ යුතුය", "ඔල්ල්ටනේටරයෙ හෝ ඩයිනමෝව කැරකැවීමට ඇති බෙල්ට් එක පරික්ෂා කළ යුතුය", "වාහනයේ විදුලි පද්ධතිය පරික්ෂා කළ යුතුය", "බැටරි වයර් පරීක්ෂා කළ යුතුය", "ඔල්ල්ටනේටරයෙ හෝ ඩයිනමෝව කැරකැවීමට ඇති බෙල්ට් එක පරික්ෂා කළ යුතුය");
        final QuestionsList question5  = new QuestionsList("ඒකාකාරී නොවන හදිසියේ හිරවෙන තිරිංග එක් රෝදයක් හෝ රෝද කිහිපයක තිබේ නම් එයින් පෙන්නුම් කරන්නේ", "තිරිංග පද්ධතියේ තෙල් කාන්දුවක් තිබීම", "බ්\u200Dරේක් ඩ්\u200Dරම් ඩිස්ක් හෝ ලයිනර් දෝෂ සහිත වීම", "තිරිංග පැඩ්ලයේ නිදහස් චලනය පමණට වඩා වැඩි වීම", "තිරිංග බල පද්ධතිය දෝෂ සහිත වීම", "බ්\u200Dරේක් ඩ්\u200Dරම් ඩිස්ක් හෝ ලයිනර් දෝෂ සහිත වීම");
        final QuestionsList question6  = new QuestionsList("වාහනය පදවා ගෙන යන අවස්ථාවක එකවිටම තිරිංග පද්ධතිය ට සම්බන්ධ පාලන බල්බ දැල් වුන හොත් ඔබ විසින් කළ යුතු වන්නේ", "වාහනය වහාම නවත්වා තිරිංග තෙල් ඇත්දැයි පරීක්ෂා කිරීම", "කාර්මිකයෙකු ගෙන්වා පරීක්ෂා කරන තුරු වාහනය නතර කර තැබීම", "වාහනය ආසන්නයේ ම ඇති ගරාජයට ගෙනයාම", "ගමනාන්තය දක්වා ප්\u200Dරවේශමෙන් ගමන් කළ යුතුය", "වාහනය වහාම නවත්වා තිරිංග තෙල් ඇත්දැයි පරීක්ෂා කිරීම");
        final QuestionsList question7  = new QuestionsList("වාහනයේ ටයරවල වායු පීඩනය අඩු වූ විට", "ටයරවල එක පැත්තක් පමණක් ගෙවෙන්නේ නැත", "ටයර් ගෙවීමට හුළං බලපාන්නේ නැත", "ටයරවල මැද ගෙවී දෙපැත්ත ඉතිරි වේ", "ටයරවල දෙපැත්ත ගෙවී මැද ඉතිරි වේ", "ටයරවල දෙපැත්ත ගෙවී මැද ඉතිරි වේ");
        final QuestionsList question8  = new QuestionsList("සුක්කානම් පද්ධතියේ නිදහස් චලනය වැඩි වන්නේ", "සුක්කානම් පද්ධතියේ කොටස් ගෙවී ඇති විට", "ඉදිරි ටයර් ගෙවී ඇති විට", "ඉදිරි රෝදවල වායු පීඩනය අඩු වූ විට", "ඉදිරි රෝදවල වායු පීඩනය වැඩි වූ විට", "සුක්කානම් පද්ධතියේ කොටස් ගෙවී ඇති විට");
        final QuestionsList question9  = new QuestionsList("ඔබ පදවාගෙන යන වාහනයේ එන්ජිම අධික ලෙස රත්වීම නිසා වතුර බොයිල් කිරීමක් ඇති වුවහොත් අඩු වතුර පිරවීමේදී", "ඒන්ජිම නවතා වතුර පිරවිය යුතුය", "එන්ජිම ධාවනය වෙමින් තිබියදී වතුර පිරවිය යුතුය", "ඉහත කරුණු දෙකම නිවැරදිය", "වාහනයේ එන්ජිම ගැන සැලකිලිමත් විය යුතු නැත", "එන්ජිම ධාවනය වෙමින් තිබියදී වතුර පිරවිය යුතුය");
        final QuestionsList question10 = new QuestionsList("ටයරයක දෙපසට වඩා මැද කොටස අධිකව ගෙවීමෙන් පෙන්නුම් කරන්නේ,", "ටයරයේ වායු පීඩනය පමණට වඩා අඩු බවයි", "ටයරයේ වායු පීඩනය පමණට වඩා වැඩි බවයි", "සුක්කානම් පද්ධතිය දෝෂ සහිත බවයි", "අවලම්භන පද්ධතිය දෝෂ සහිත බවයි", "ටයරයේ වායු පීඩනය පමණට වඩා වැඩි බවයි");
        final QuestionsList question11 = new QuestionsList("ඔබ පදවාගෙන යන වාහනයේ එන්ජිම විදුලි දෝෂයක් නිසා ටයර් පිලිස්සෙන ගඳක් ඇති වුවහොත් වහාම කළ යුතු වන්නේ", "ප්\u200Dරධාන ස්විචය ක්\u200Dරියා විරහිත කිරීමයි", "පියුස් (විලායක) ගැලවීමයි", "බැටරි වයර් ගැලවීමයි", "වාහනයේ සියලුම පහන් නිවා දැමීමයි", "බැටරි වයර් ගැලවීමයි");
        final QuestionsList question12 = new QuestionsList("ඔබ පදවන වාහනයේ බැටරියේ ආරෝපණය (චාජ්) නොවන බවට දන්වන බල්බය එක විට දැල්වුණේ නම් ඔබ විසින්මුලින් කළ කළ යුත්තේ", "ඕල්ටනේටරයකෝ ඩයිනමෝව කැර කිරීමට ඇති බෙල්ට බෙරය පරීක්ෂා කළ යුතුය", "විලායක (ෆියුස්)පරික්ෂා කළ යුතුය", "වාහනය නතර කර විදුලි කාර්මිකයෙකු රැගෙන ආ යුතුය", "වාහනයේ බැටරිය පරීක්ෂාකල යුතුය", "ඕල්ටනේටරයකෝ ඩයිනමෝව කැර කිරීමට ඇති බෙල්ට බෙරය පරීක්ෂා කළ යුතුය");
        final QuestionsList question13 = new QuestionsList("වාහනයේ තිරිංග යෙදීමේදී වම් පැත්තට පැත්තට ඇදී යන්නේ නම් එයින් අදහස් වන්නේ", "ඉදිරිපස වම් පැත්තේ රෝදයේ  තිරිංග තෙල් කාන්දු වීමයි", "ඉදිරිපස දකුණු පැත්තේ රෝදය තිරිංග තෙල් කාන්දු වීමයි", "පසුපස රෝද වලට තිරිංග නොමැති බවයි", "රෝදවල වායු පීඩනයේ එකිනෙකට වෙනස් බවයි", "ඉදිරිපස දකුණු පැත්තේ රෝදය තිරිංග තෙල් කාන්දු වීමයි");
        final QuestionsList question14 = new QuestionsList("ඒන්ජිමකට ලිහිසි තෙල් භාවිතා කරනු ලබන්නේ", "චලනය වන කොටස්වල ගෙවීම අවම කරගැනීම සඳහා", "ඉන්ධන දහනයේදී එහි කාර්යක්ෂමතාවය වැඩි කිරීමට", "එන්ජිමෙහි කාර්යක්ෂමතාවය වැඩි කිරීමට", "එන්ජිම තුළ ඇති වායු සංසරණ වේගය වැඩි කිරීමට", "චලනය වන කොටස්වල ගෙවීම අවම කරගැනීම සඳහා");
        final QuestionsList question15 = new QuestionsList("ඩිෆරන්සලයේ ක්\u200Dරියාකාරීත්වය කුමක්ද ?", "ටයර්වලට හානියක් නොවී වැඩි බරක් ගෙනයාම පිණිසය", "වාහනය වංගුවක ධාවනය කිරීමේදී රෝදවල වේගය වෙනස් කිරීමය", "ටයර් වල අක්\u200Dරමවත් ගෙවීම අඩු කිරීමය", "වාහනය වංගුවක ධාවනය කිරීමේදී රෝදවල වේගය සමාන කිරීමය", "වාහනය වංගුවක ධාවනය කිරීමේදී රෝදවල වේගය වෙනස් කිරීමය");
        final QuestionsList question16 = new QuestionsList("තිරිංග තෙල් භාවිතා කරන වාහනය ක තිරිංග පැඩලය පහතට බැසීමක් සිදු බැසීමක් සිදු වන්නේ", "brake bind( තිරිංග හිරවීමක්)ඇති බවයි", "තිරිංග නිසි පරිදි ක්\u200Dරියා කරන බවයි", "තිරිංග තෙල් කාන්දුවක් ඇති බවයි", "තිරිංග පැඩලය දෝෂයක් ඇති බවයි", "තිරිංග තෙල් කාන්දුවක් ඇති බවයි");
        final QuestionsList question17 = new QuestionsList("වාහනයක් ධාවනය කිරීමේදී  ගීයර මාරු කිරීමේ අපහසුතා ඇත්නම් වඩාත්  විය හැක්කේ", "ක්ලච් එක නිසි පරිදි ක්\u200Dරියා නොකිරීමය", "එන්ජිමේ වේගය නිසි පරිදි නොමැති වීමයි", "ගියර පෙට්ටියේ දෝෂයක් ඇති බවයි", "වාහනයේ ගියර  ලීවරයේ  දෝෂයක් ඇති බවයි", "ක්ලච් එක නිසි පරිදි ක්\u200Dරියා නොකිරීමය");
        final QuestionsList question18 = new QuestionsList("වාහනයක් ධාවනය කිරීමේදී ඉදිරිපස දෙදරීමට හේතු විය හැක්කේ,", "වෙනස් නිෂ්පාදන වර්ගවල ටයර සවිකර තිබීමය", "ඉදිරි රෝදවල ටයර වායු ප්\u200Dරමාණය වෙනස් අගයන් වීමය", "ඉදිරි රෝද ටයරවල කට්ටා මෝස්තර වෙනස් වීමය", "සුක්කානම් පද්ධතියේ කොටස් ගෙවී තිබීමය", "සුක්කානම් පද්ධතියේ කොටස් ගෙවී තිබීමය");
        final QuestionsList question19 = new QuestionsList("වාහනේ ජල පොම්පේ ක්\u200Dරියාකාරිත්වය  වනුයේ", "එන්ජිම තුල ජලය සංසරණය කිරීම වැළැක්වීමයි", "රේඩියේටරය සිසිල් කිරීමය", "එන්ජිමේ  තෙල් සංසරණය පහසු කිරීමයි", "එන්ජිමේ භාවිතා කරන ජලය සිසිල් කිරීමය", "එන්ජිම තුල ජලය සංසරණය කිරීම වැළැක්වීමයි");
        final QuestionsList question20 = new QuestionsList("වාහනයේ ටයර් වල හුලං නියමිත ප්\u200Dරමාණයට වැඩි වූ විට", "ටයරය ඉක්මනින් ගෙවී යයි", "ටයරය මැද  ඉක්මනින් ගෙවී ගෙවී යයි", "ටයරයේ දෙපැත්ත ඉක්මනින් ගෙවී යයි", "ටයරය තැනින් තැන වැඩි වැඩියෙන් ගෙවී යයි", "ටයරය මැද  ඉක්මනින් ගෙවී ගෙවී යයි");


        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        questionsLists.add(question11);
        questionsLists.add(question12);
        questionsLists.add(question13);
        questionsLists.add(question14);
        questionsLists.add(question15);
        questionsLists.add(question16);
        questionsLists.add(question17);
        questionsLists.add(question18);
        questionsLists.add(question19);
        questionsLists.add(question20);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "නීති":
                return නීතිQuestions();
            case "මාර්ග සංඥා":
                return මාර්ගසංඥාQuestions();
            case "බර වාහන":
                return බරවාහනQuestions();
            default:
                return අනෙකුත්සංඥාQuestions();
        }
    }
}
