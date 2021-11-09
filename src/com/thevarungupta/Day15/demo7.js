let myPromise = new Promise(function(resolve, reject){
    let a = 100;
    if(a==200){
        resolve('ok')
    }else{
        reject('error')
    }
})

myPromise
    .then(function(response){
        console.log(response)
    }).catch(function(err){
        console.error(err)
    })

