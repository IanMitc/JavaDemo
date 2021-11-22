import React,{ useState } from 'react';
import axios from 'axios';



const Posts = () => {
    const [posts, setPosts] = useState([]);


    function onClickHandler(){
        axios.get('https://jsonplaceholder.typicode.com/posts')
            .then(response =>{
                setPosts(response.data)
            })
            .catch(error => console.error(error))
    }


    return(
        <div>
                        <button onClick={onClickHandler}>Get Data</button>
                        <table className="table table-bordered">
                            <thead className="thead-dark">
                                    <tr>
                                        <td>Title</td>
                                        <td>Body</td>
                                    </tr>                                
                            </thead>
                            <tbody>
                                {
                                    posts.map(post => (<tr>
                                        <td>{ post.title }</td>
                                        <td>{post.body}</td>
                                    </tr>))
                                }
                            </tbody>
                        </table>
        </div>
    )
}
export default Posts;