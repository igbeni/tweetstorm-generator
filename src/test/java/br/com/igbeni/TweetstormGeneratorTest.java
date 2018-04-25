package br.com.igbeni;


import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TweetstormGeneratorTest {

    @Test
    public void testGenerateTweetstormIsNull() {
        assertThat(TweetstormGenerator.generateTweetstorm(null)).isNull();
        assertThat(TweetstormGenerator.generateTweetstorm("")).isNull();
    }

    @Test
    public void testGenerateTweetstormOne() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec lacinia, augue sit amet consequat luctus, tellus felis accumsan augue, in rhoncus mauris nulla ultrices urna. Suspendisse fringilla metus justo. Ut aliquam semper mi, ac eleifend nibh luctus eget. Aenean congue lorem at nunc sagittis, sed sodales lorem laoreet. Nam et nunc id metus aliquam porta at et nisl. Cras eros erat, sagittis et molestie ac, ultrices eu eros. Cras auctor ligula quis urna egestas viverra. Maecenas a dolor eu magna dapibus hendrerit sed eu urna. Mauris sed vehicula ipsum. Duis dictum venenatis tristique. In eget nulla ante. Quisque ultricies, massa nec semper faucibus, lorem dolor dapibus diam, a tincidunt odio arcu vel elit.\n" +
                "\n" +
                "Phasellus efficitur tellus lacus, at euismod lacus tristique vel. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Etiam venenatis urna non lorem convallis, ut faucibus urna elementum. Donec nec vulputate metus. Sed scelerisque, ex eget dignissim blandit, sem tellus sollicitudin magna, quis varius lectus ex vitae justo. Nunc a velit varius, semper dui in, molestie sapien. Aliquam tempor pellentesque ligula sit amet condimentum. Maecenas sollicitudin erat in ornare laoreet. Aliquam erat volutpat. Curabitur tincidunt odio vel nunc fermentum dictum. Phasellus volutpat, ipsum quis vulputate efficitur, tortor tortor convallis felis, ut porttitor quam metus a elit. Nunc lacinia dui arcu, sit amet elementum lorem elementum sit amet. Ut pellentesque scelerisque lectus at pretium. In hac habitasse platea dictumst.\n" +
                "\n" +
                "Proin felis tellus, elementum eget bibendum quis, lobortis sit amet ipsum. Curabitur iaculis dapibus suscipit. Fusce feugiat sapien et ipsum malesuada viverra. In fermentum ac felis sit amet vestibulum. Nunc augue elit, vehicula sit amet nibh iaculis, dictum eleifend velit. Nullam in risus auctor, commodo lacus a, suscipit ipsum. Maecenas in maximus tellus. Etiam ut feugiat massa. Praesent facilisis tristique nulla. Morbi sed laoreet eros. Maecenas sed nibh eleifend, semper dolor a, eleifend lectus. Pellentesque efficitur suscipit tempor. Praesent est lorem, dapibus at lorem eu, vestibulum porta turpis. Integer scelerisque orci augue, quis vestibulum lacus egestas ut.\n" +
                "\n" +
                "Etiam eget nisl et dolor malesuada imperdiet eu vel augue. Fusce et eleifend velit. Curabitur mattis auctor ante, eu molestie purus faucibus et. Integer sit amet ex auctor, porttitor sem in, aliquam turpis. Pellentesque eleifend, erat sed mollis finibus, magna odio finibus ligula, quis accumsan eros sapien id enim. Proin faucibus dolor eu nunc pellentesque scelerisque. Quisque nec dapibus urna. Nullam dignissim sem ut ante dapibus varius. Mauris mollis nulla lorem. Donec nec finibus nisi. In venenatis augue velit, quis lacinia justo vulputate pharetra. Mauris egestas diam orci, eget fermentum nisi auctor et.\n" +
                "\n" +
                "Duis tempor est non dolor maximus tempor. Morbi enim enim, pretium eu pulvinar ac, volutpat in erat. Aliquam erat volutpat. Vivamus sodales nisl ligula, ac interdum quam volutpat et. Mauris odio elit, accumsan at vulputate accumsan, ornare in nulla. Suspendisse a nisi quis tellus molestie ultricies sit amet at felis. Mauris eleifend dolor ac posuere tempus. In eu vehicula lorem, at rutrum sem. In eu odio quis nisl porttitor condimentum.";

        List<String> tweets = TweetstormGenerator.generateTweetstorm(text);

        for (String tweet : tweets) {
            assertThat(tweet.length()).isLessThanOrEqualTo(140);
        }

        assertThat(tweets).hasSize(27);
    }

    @Test
    public void testGenerateTweetstormTwo() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce lacinia mauris in leo condimentum semper. Morbi interdum dui nisl, et placerat ante eleifend at. Vestibulum hendrerit sem lorem, sagittis iaculis neque fermentum et. Sed in commodo urna, vitae ornare lectus. In nunc ante, consequat vitae orci in, posuere laoreet ante. In sed nisl sit amet justo aliquam auctor. Nullam tincidunt mattis nibh at posuere. Suspendisse sapien tellus, fermentum facilisis dolor vitae, faucibus ultrices turpis. Maecenas id turpis ullamcorper, condimentum neque non, scelerisque risus. Nunc ac ornare risus. Fusce viverra commodo ullamcorper. In hac habitasse platea dictumst. Donec et porttitor risus. Nunc interdum odio eget risus accumsan, eget sagittis dui ultrices.\n" +
                "\n" +
                "Donec sit amet scelerisque risus. In blandit mattis risus, ac malesuada eros consequat facilisis. Sed ultricies nunc in augue cursus, at porta felis feugiat. Pellentesque volutpat est eu porta molestie. Nunc nec nisl nulla. Nunc ut malesuada arcu. Praesent porta eu sapien vel aliquam. Vestibulum ac augue et nunc semper mattis. Aenean in nisl ac metus scelerisque congue a vitae elit. Quisque fermentum augue at felis egestas, sit amet tincidunt felis porttitor. Cras pulvinar elit quis imperdiet mollis. Curabitur vel sem non metus fermentum tincidunt at sed diam. Curabitur lacinia urna sit amet orci tristique lobortis.\n" +
                "\n" +
                "Suspendisse hendrerit risus et condimentum malesuada. Nam iaculis, enim non finibus finibus, dolor dolor cursus sapien, sed efficitur orci magna et urna. Morbi faucibus, odio nec dictum porta, nulla sem viverra ante, at posuere risus nibh quis neque. Nullam justo odio, ultrices in elementum non, egestas tristique nulla. Mauris eleifend enim ac lectus dictum, a condimentum orci aliquet. Phasellus lobortis magna nec sapien tristique, eget porta diam tempor. Aliquam sollicitudin pharetra orci a facilisis. Donec sodales sit amet lacus sed venenatis. Donec mauris eros, egestas eu eros et, laoreet hendrerit erat. Nulla facilisi. Duis rhoncus vitae augue sed eleifend.\n" +
                "\n" +
                "Phasellus sagittis est vitae nisl lobortis scelerisque. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Etiam aliquet eros vitae magna sollicitudin maximus. Maecenas sit amet feugiat dolor, id tincidunt nibh. Praesent iaculis ullamcorper elit, semper porttitor urna placerat id. Nam et augue ac mauris maximus eleifend. Donec congue feugiat nibh vel sodales. Suspendisse finibus nec turpis molestie consectetur. Nam dignissim ex vitae sagittis lobortis. Proin pretium neque eu odio fermentum pretium. Sed sit amet vestibulum tellus. Cras rhoncus ultrices tortor, nec volutpat enim. Aliquam viverra ipsum ut enim interdum, id consectetur justo feugiat. Integer auctor ornare diam, a euismod sapien tristique et.\n" +
                "\n" +
                "In hac habitasse platea dictumst. Fusce ultrices nulla et sapien ultricies fringilla. Nullam et erat nibh. Nulla dapibus quis nisl ut tristique. Maecenas molestie turpis sem, in euismod eros ultricies ac. Suspendisse varius ultricies dolor convallis gravida. Vestibulum nec purus vehicula dolor pretium tempus vitae eu arcu. Nunc in lorem eget nisl viverra rhoncus et nec quam. Aliquam ac ex efficitur, efficitur nibh convallis, auctor eros. Proin sit amet velit nec metus egestas congue.\n" +
                "\n" +
                "Praesent eu facilisis ipsum, quis maximus dui. Curabitur eleifend rhoncus porta. Maecenas tincidunt nisl a lectus dictum, eget laoreet leo feugiat. Curabitur ut consectetur nisi. Mauris ex nisl, luctus in convallis quis, imperdiet ut metus. Pellentesque eu purus sit amet felis lobortis auctor. In a molestie lectus. Donec eu mollis magna, quis molestie turpis. Aliquam porttitor consectetur risus sit amet tincidunt. Ut rutrum malesuada quam, et elementum ligula. Sed aliquam diam sit amet ullamcorper volutpat. Quisque finibus justo eget cursus scelerisque. Mauris placerat leo eget dolor ultricies dapibus sed vel elit. Vestibulum condimentum auctor suscipit. Aliquam consequat mi odio, et lobortis urna feugiat vel.\n" +
                "\n" +
                "Fusce eu tristique velit. Phasellus accumsan nulla in nunc lacinia, non tempor diam ultrices. Curabitur auctor nunc arcu, a dignissim lectus rhoncus et. Fusce ante enim, ullamcorper sit amet iaculis sed, facilisis sed libero. Aenean pharetra, ante ut feugiat sodales, enim turpis convallis massa, ut tempus lectus neque at arcu. Suspendisse eu velit turpis. Nunc vitae porta tortor, sed hendrerit tellus. Mauris nisi leo, ornare eget molestie vitae, laoreet non nulla. Curabitur vel tristique sem, non suscipit eros. Donec maximus tempor pulvinar. Nunc mi diam, facilisis vel sollicitudin ac, faucibus sed ligula.\n" +
                "\n" +
                "Praesent congue feugiat elit, sed viverra neque venenatis vel. Aenean molestie volutpat auctor. Aenean ultricies ullamcorper justo, nec ullamcorper dui tincidunt nec. Aenean sagittis sem eget nisl sollicitudin, quis pulvinar orci semper. Aliquam pretium gravida nunc, nec ultricies enim vulputate vitae. Mauris dapibus eu ligula viverra ullamcorper. Sed suscipit finibus est, bibendum varius nulla rutrum quis. Integer dapibus arcu lorem. Fusce id velit non arcu blandit vehicula quis vitae risus. Nunc quis nulla consequat, imperdiet massa sodales, varius massa. Sed eu arcu egestas, volutpat dui ut, mattis tellus. Nunc consectetur ipsum nunc, vel sollicitudin elit cursus ut. Interdum et malesuada fames ac ante ipsum primis in faucibus.\n" +
                "\n" +
                "Integer id venenatis diam. Maecenas dictum tellus metus, vitae pretium velit ornare sit amet. Nam consequat commodo turpis, suscipit efficitur lectus lacinia sit amet. Morbi eu aliquam erat. Donec bibendum ut orci ut molestie. Nullam efficitur erat turpis, id tempor leo elementum sodales. Nulla hendrerit purus lectus, eu efficitur sem viverra nec. Suspendisse potenti. Curabitur blandit tellus et molestie facilisis. Maecenas vel commodo quam, id eleifend dolor. Vestibulum varius lectus nisl, non facilisis magna pharetra quis. Aenean consectetur pretium leo eget pellentesque. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Quisque vitae enim ante. Aenean augue magna, volutpat at finibus ac, tristique eu ante. Duis turpis mauris, sollicitudin quis consequat eget, volutpat nec purus.\n" +
                "\n" +
                "Mauris pellentesque erat ut risus euismod laoreet. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam efficitur ullamcorper diam. Maecenas placerat ipsum eget purus ultricies mollis. Fusce at vulputate lectus. Suspendisse rhoncus a nisi id laoreet. Donec condimentum hendrerit turpis, vitae rhoncus augue scelerisque non. Maecenas a gravida risus. Proin maximus neque eget consequat porttitor. In tempor malesuada sem, eget condimentum odio semper ut. Integer eget est ac dolor venenatis tempor sit amet vel elit. Cras nec dignissim dui, eget pulvinar metus. Praesent quam massa, tincidunt eget magna vel, scelerisque ullamcorper massa. Morbi venenatis enim porttitor dignissim consectetur. Nulla quis auctor metus. Duis ac tellus urna.\n" +
                "\n" +
                "Etiam vitae elementum tellus, lacinia mattis eros. Cras eu velit eros. Donec dignissim sapien eget congue finibus. Sed porta leo velit, eu semper magna scelerisque eu. Nulla purus quam, faucibus eu libero sed, auctor lacinia nisl. Duis a rhoncus orci, sit amet mollis eros. Nunc vestibulum molestie enim ut eleifend. Donec nisl diam, pellentesque sed elit eu, commodo eleifend ipsum. Praesent id malesuada nunc, id luctus tellus. Phasellus suscipit tempor justo, non hendrerit elit mollis molestie. Praesent vel turpis semper, blandit ligula et, bibendum metus. Duis rutrum elit et est interdum, id sagittis mauris ullamcorper. Donec ut odio tortor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla dictum magna maximus nisi pharetra egestas. Nulla pellentesque suscipit risus, ut porttitor lorem pulvinar quis.\n" +
                "\n" +
                "Cras malesuada tempus ante, ut fringilla risus laoreet vitae. Vivamus malesuada, eros sit amet pretium aliquam, neque lorem molestie sem, eget efficitur mi nunc scelerisque sem. Fusce vel elit at nisl imperdiet condimentum a ac magna. Morbi pretium nibh eu dui porta luctus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla eu orci nec libero auctor mollis. Nunc placerat luctus ex et fermentum. Suspendisse potenti. Aliquam blandit tempus ex id egestas. Donec eget purus quis lectus congue imperdiet ut et ex.\n" +
                "\n" +
                "Vestibulum non lorem lobortis, pulvinar ex a, ullamcorper metus. Curabitur tincidunt, mauris eu vulputate luctus, sem metus rutrum nunc, sit amet interdum velit leo et ante. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi euismod erat sit amet elit tempus elementum. Donec ac metus eget sem finibus congue. In at facilisis ipsum. Aenean condimentum posuere mauris, quis convallis justo ullamcorper ultricies. Aenean ac velit facilisis lorem auctor pharetra. Aenean a lorem nisi. Sed tempus ullamcorper pharetra. Mauris pellentesque commodo bibendum. Nulla sollicitudin libero libero, at consequat nibh posuere et.\n" +
                "\n" +
                "In pharetra sem vitae justo vestibulum euismod. Donec ornare libero a tellus placerat rhoncus. Aliquam erat volutpat. Integer rutrum eget arcu et ultrices. Morbi quis egestas turpis, id feugiat nibh. Nulla id luctus diam. Pellentesque rhoncus orci felis, vitae interdum augue facilisis eu. Nullam varius ipsum consectetur egestas tincidunt. Cras placerat, urna at viverra dictum, ipsum augue convallis nibh, vel dictum nisl nisi sed felis. Maecenas at erat varius, dictum mi ut, posuere dolor. Praesent rhoncus pretium elementum. Maecenas non nibh eget ligula accumsan vulputate et quis urna. Nam id vulputate mauris. Proin maximus libero sagittis placerat posuere.\n" +
                "\n" +
                "Maecenas tristique, ex sit amet facilisis volutpat, mauris nisl dictum neque, nec accumsan magna urna non neque. Etiam pellentesque varius velit vitae dignissim. Sed nec nisi accumsan, dapibus orci id, congue neque. Nulla quis ex non erat laoreet ornare ac a neque. Fusce tempor congue tempor. Pellentesque eget commodo nulla. Mauris in ex ac augue faucibus pretium. Donec malesuada viverra ante, quis interdum risus rhoncus et. Donec quis lectus vitae dolor pretium gravida. Vivamus sodales mauris et lacus euismod, sed vulputate augue imperdiet. Curabitur congue diam libero, vel cursus ligula dignissim non. Aliquam suscipit mauris eu turpis posuere ultrices. Morbi consectetur porta leo, vitae ornare erat vestibulum vitae.";

        List<String> tweets = TweetstormGenerator.generateTweetstorm(text);

        for (String tweet : tweets) {
            assertThat(tweet.length()).isLessThanOrEqualTo(140);
        }

        assertThat(tweets).hasSize(84);
    }
}