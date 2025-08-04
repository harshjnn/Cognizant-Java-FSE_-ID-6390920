import React from 'react';
import { blogs } from '../data/blogs';

const BlogDetails = () => {
  const content = (
    <ul>
      {blogs.map((blog, index) => (
        <div key={index}>
          <h1>{blog.title}</h1>
          <strong>{blog.author}</strong>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="vl">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
};

export default BlogDetails;
