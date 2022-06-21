package script.theme_park.tatooine.jabbaspawner;

import script.dictionary;
import script.obj_id;

public class random10 extends script.base_script
{
    public random10()
    {
    }
    public int OnDestroy(obj_id self) throws InterruptedException
    {
        obj_id palace = getObjIdObjVar(self, "palace");
        messageTo(palace, "random10Died", null, 20, true);
        return SCRIPT_CONTINUE;
    }
    public int doFacing(obj_id self, dictionary params) throws InterruptedException
    {
        obj_id faceTarget = getObjIdObjVar(self, "facer");
        faceTo(self, faceTarget);
        return SCRIPT_CONTINUE;
    }
}
