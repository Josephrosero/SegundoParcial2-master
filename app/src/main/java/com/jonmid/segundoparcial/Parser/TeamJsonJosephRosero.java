package com.jonmid.segundoparcial.Parser;

import com.jonmid.segundoparcial.Model.TeamModelJosephRosero;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 17/10/2017.
 */

public class TeamJsonJosephRosero {

    public static List<TeamModelJosephRosero> getData(String content) throws JSONException {
        JSONObject jsonObject = new JSONObject(content);
        JSONArray jsonArray = jsonObject.getJSONArray("teams");

        List<TeamModelJosephRosero> photosList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject item = jsonArray.getJSONObject(i);

            TeamModelJosephRosero photos = new TeamModelJosephRosero();

            photos.setName(item.getString("name"));
            photos.setCode(item.getString("code"));
            photos.setCresUrl(item.getString("crestUrl"));

            photosList.add(photos);
        }
        return photosList;
    }
}
