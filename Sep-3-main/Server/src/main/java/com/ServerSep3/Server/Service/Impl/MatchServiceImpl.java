package com.ServerSep3.Server.Service.Impl;
import com.ServerSep3.Server.Model.ChatModel;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.ChatRepository;
import com.ServerSep3.Server.Repository.MatchRepository;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.MatchService;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {


    private final MatchRepository matchRepository;
    private final UserRepository userRepository;
    private final ChatRepository chatRepository;

    public MatchServiceImpl(MatchRepository matchRepository, UserRepository userRepository, ChatRepository chatRepository) {
        this.matchRepository = matchRepository;
        this.userRepository = userRepository;
        this.chatRepository = chatRepository;
    }


    @Override
    public MatchModel findById(int id) {
        return matchRepository.findById(id);
    }

    @Override
    public MatchModel updateMatch(MatchModel matchModel) {
        MatchModel existing=matchRepository.findById(matchModel.getId());
        if(isMatch(matchModel)){
            existing.setMatch("true");
            ChatModel chatModel= new ChatModel(0,existing.getUserId1(), existing.getUserId2());
            chatRepository.save(chatModel);
        }
        existing.setMatchUser2(matchModel.getMatchUser2());
        existing.setMatchUser1(matchModel.getMatchUser1());
        return matchRepository.save(existing);
    }

    @Override
    public void deleteMatch(long id) {
        matchRepository.deleteById(id);
    }

    @Override
    public List<MatchModel> findByUserId(int id) {
        List<MatchModel> list1=matchRepository.findByUserId1(id);
        List<MatchModel> list2=matchRepository.findByUserId2(id);
        List<MatchModel> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);
        /*for (int i=0; i<resultList.size()-1;i++){
            if(resultList.get(i).getUserId1() == id && !(resultList.get(i).getMatchUser1()).equals("null")){
                    list1.remove(i);
            }
        }\
       /* for (int i=0; i<resultList.size();i++){
            if(resultList.get(i).getUserId2() == id && !(resultList.get(i).getMatchUser2()).equals("null")){
                list1.remove(i);
            }*/

        return resultList;
    }

    @Override
    public boolean isMatch(MatchModel matchModel) {
        String match1= matchModel.getMatchUser1();
        String match2= matchModel.getMatchUser2();
        if(match1.equals("true") & match2.equals("true")){
            return true;
        }
        return false;
    }

    @Override
    public void CreateMatchForUser(UserModel userModel){
        String preference=userModel.getPreference();
        List<UserModel> matchList=userRepository.findByGender(preference);
        for (int i=0;i<matchList.size();i++){
            MatchModel matchModel= new MatchModel();
            matchModel.setUserId1(userModel.getId());
            matchModel.setUserId2(matchList.get(i).getId());
            createMatch(matchModel);
        }
    }

    @Override
    public MatchModel createMatch(MatchModel matchModel) {
        matchModel.setMatchUser1("null");
        matchModel.setMatchUser2("null");
        matchModel.setMatch("null");
        return matchRepository.save(matchModel);
    }
}
