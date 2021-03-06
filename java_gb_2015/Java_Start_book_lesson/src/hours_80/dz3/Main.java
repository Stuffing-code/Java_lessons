package hours_80.dz3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String test = "В соседней комнате зашумело женское платье. Как будто очнувшись, князь Андрей встряхнулся, и лицо его приняло то же выражение, какое оно имело в гостиной Анны Павловны. Пьер спустил ноги с дивана. Вошла княгиня. Она была уже в другом, домашнем, но столь же элегантном и свежем платье. Князь Андрей встал, учтиво подвигая ей кресло.\n" +
                "— Отчего, я часто думаю, — заговорила она, как всегда, по-французски, поспешно и хлопотливо усаживаясь в кресло, — отчего Анет не вышла замуж? Как вы все глупы, messieurs, что на ней не женились. Вы меня извините, но вы ничего не понимаете в женщинах толку. Какой вы спорщик, мсье Пьер!\n" +
                "— Я и с мужем вашим все спорю; не понимаю, зачем он хочет идти на войну, — сказал Пьер, без всякого стеснения (столь обыкновенного в отношениях молодого мужчины к молодой женщине) обращаясь к княгине.\n" +
                "Княгиня встрепенулась. Видимо, слова Пьера затронули ее за живое.\n" +
                "— Ах, вот я то же говорю! — сказала она. — Я не понимаю, решительно не понимаю, отчего мужчины не могут жить без войны? Отчего мы, женщины, ничего не хотим, ничего нам не нужно? Ну, вот вы будьте судьей. Я ему все говорю: здесь он адъютант у дяди, самое блестящее положение. Все его так знают, так ценят. На днях у Апраксиных я слышала, как одна дама спрашивает: «C'est ça le fameux prince André?» Ma parole d'honneur! 1 — Она засмеялась. — Он так везде принят. Он очень легко может быть и флигель-адъютантом. Вы знаете, государь очень милостиво говорил с ним. Мы с Анет говорили, это очень легко было бы устроить. Как вы думаете?\n" +
                "Пьер посмотрел на князя Андрея и, заметив, что разговор этот не нравился его другу, ничего не отвечал.\n" +
                "— Когда вы едете? — спросил он.\n" +
                "— Ah! ne me parlez pas de ce départ, ne m'en parlez pas. Je ne veux pas en entendre parler 2, — заговорила княгиня таким капризно-игривым тоном, каким она говорила с Ипполитом в гостиной и который так, очевидно, не шел к семейному кружку, где Пьер был как бы членом. — Сегодня, когда я подумала, что надо прервать все эти дорогие отношения... И потом, ты знаешь, André? — Она значительно мигнула мужу. — J'ai peur, j'ai peur! 3 — прошептала она, содрогаясь спиною.\n" +
                "Муж посмотрел на нее с таким видом, как будто он был удивлен, заметив, что кто-то еще, кроме его и Пьера, находился в комнате; однако с холодною учтивостью вопросительно обратился к жене:\n" +
                "— Чего ты боишься, Лиза? Я не могу понять, — сказал он.\n" +
                "— Вот как все мужчины эгоисты; все, все эгоисты! Сам из-за своих прихотей, Бог знает зачем, бросает меня, запирает в деревню одну.\n" +
                "— С отцом и сестрой, не забудь, — тихо сказал князь Андрей.\n" +
                "— Все равно одна, без моих друзей... И хочет, чтоб я не боялась.\n" +
                "Тон ее уже был ворчливый, губка поднялась, придавая лицу не радостное, а зверское, беличье выражение. Она замолчала, как будто находя неприличным говорить при Пьере про свою беременность, тогда как в этом и состояла сущность дела.\n" +
                "— Все-таки я не понял, de quoi vous avez peur 4, — медлительно проговорил князь Андрей, не спуская глаз с жены.\n" +
                "Княгиня покраснела и отчаянно взмахнула руками.\n" +
                "— Non, André, je dis que vous avez tellement, tellement changé... 5\n" +
                "— Твой доктор велит тебе раньше ложиться, — сказал князь Андрей. — Ты бы шла спать.\n";
        int count = 1;
        
        String[] value = test.split(" ");


        for (String o :
                value) {
            System.out.println(o);
        }

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String valueS : value) {
            if (map.containsKey(valueS)) {
                Integer key = map.get(valueS);
                key += 1;
                map.put(valueS, key);
            } else {
                map.put(valueS, count);
            }
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Object o:
             set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
            
        }



    }
}
