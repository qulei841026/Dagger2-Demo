package qulei.android.dagger2.demo.provider;

import java.util.List;

import qulei.android.dagger2.demo.model.Message;

public interface MessageProvider {

    int getMessageUnread();

    void syncMessageCount();

    void findMessageItems(OnFindMessageListener listener);

    interface OnFindMessageListener {
        void onItems(List<Message> items);
    }

}
