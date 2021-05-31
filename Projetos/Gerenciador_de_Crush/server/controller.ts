import model from './model';

class Controller{
    updateCrush: any;
    createCrush: any;
    constructor(){}

    getCrushs(){
        return model.find({});
    }

    select(req,res){
        this.getCrushs()
        .then(crushs => res.status(200).json({'result': crushs}) )
        .catch(err => res.status(400).json({'result': err}) );
    }

    //select
    getCrushsById(id){
        return model.find(id);
    }

    selectOne(req,res){
        const id = {_id: req.params.id}
        this.getCrushsById(id)
        .then(crushs => res.status(200).json({'result': crushs}))
        .catch(err => res.status(400).json({'result': err}));
    }

    //delete
    deleteCrushsById(id){
        return model.deleteOne(id);
    }

    delete(req,res){
        const id = {_id: req.params.id}
        this.deleteCrushsById(id)
        .then(crushs => res.status(200).json({'result': crushs}))
        .catch(err => res.status(400).json({'result': err}));
    }

    //update
    updateCrushsById(id, data){
        return model.findOneAndUpdate(id, data);
    }

    update(req,res){
        const id = {_id: req.params.id};
        const crush = req.body;

        this.updateCrush(id, crush)
        .then(crushs => res.status(200).json({'result': crushs}))
        .catch(err => res.status(400).json({'result': err}));
    }

    //inserir
    createCrushsById(data){
        return model.create(data);
    }

    insert(req,res){
        const crush = req.body;

        this.createCrush(crush)
            .then(crushs => res.status(200).json({'result': crushs}))
            .catch(err => res.status(400).json({'result': err}));
    }
}

export default Controller;