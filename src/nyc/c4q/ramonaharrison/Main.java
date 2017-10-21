package nyc.c4q.ramonaharrison;

import nyc.c4q.ramonaharrison.model.Message;
import nyc.c4q.ramonaharrison.network.Slack;
import nyc.c4q.ramonaharrison.network.response.ListMessagesResponse;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();
        Slack mySlack = new Slack();


        myBot.testApi();

        myBot.listChannels();
        myBot.listMessages("C7KE0KTM4");

        //mySlack.sendMessage(myBot.jokes());


        // Post "Hello, world!" to the #bots channel
        //myBot.sendMessageToBotsChannel());
        //myBot.listChannels();

        // Post a pineapple photo to the #bots channel
        //myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

        //myBot.sendDirectMessageToAUser(Joanne, "Hi");

    }
}