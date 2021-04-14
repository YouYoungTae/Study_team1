
window.onload= function(){

    console.log("n1");

    
    var fncLoc =function (e ) {
        
        for  (var num=0 ;;){
            if (document.querySelectorAll("#viewPageSelector .toggleView")[num] ===e){
                return num;
            }
            if (num >50) {break;}
            num ++;
        }

    }

    document.querySelectorAll("#viewPageSelector .toggleView")
    .forEach( (e) => {
        e.addEventListener("click", (ei ) =>{
            console.log(fncLoc(ei.currentTarget));
            for (var num=0 ;num< document.querySelectorAll("#viewPage .toggleView").length;){
                document.querySelectorAll("#viewPage .toggleView")[num]["visiblity"]="collapse"

                if (num >50) {break;}
                num ++;
            }
            var findnum =fncLoc(ei.currentTarget);

            document.querySelectorAll("#viewPage .toggleView")[findnum]["visiblity"]="visiblie"
        });
    });

    console.log("n2");

};

