
## Project Overview

| [Blog](https://nextjs-blog.sanity.build)                                                                          | [Studio](https://nextjs-blog.sanity.build/studio)                                                                          |
| ----------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| ![Blog](https://github.com/sanity-io/nextjs-blog-cms-sanity-v3/assets/81981/adc1a90e-644e-456a-b630-ac44e4636e24) | ![Sanity Studio](https://github.com/sanity-io/nextjs-blog-cms-sanity-v3/assets/81981/93a39af1-a806-45ca-8648-0cc7e2295eea) |

### Important files and folders

| File(s)                                     | Description                                              |
| ------------------------------------------- | -------------------------------------------------------- |
| `sanity.config.ts`                          |  Config file for Sanity Studio                           |
| `sanity.cli.ts`                             |  Config file for Sanity CLI                              |
| `/pages/studio/[[...index]].tsx`            |  Where Sanity Studio is mounted                          |
| `/pages/api/revalidate.ts`                  |  Serverless route for triggering ISR                     |
| `/pages/api/draft.ts`                       |  Serverless route for triggering Draft mode              |
| `/schemas`                                  |  Where Sanity Studio gets its content types from         |
| `/plugins`                                  |  Where the advanced Sanity Studio customization is setup |
| `/lib/sanity.api.ts`,`/lib/sanity.image.ts` | Configuration for the Sanity Content Lake client         |
| `/components/PreviewProvider.tsx`           | Configuration for the live Preview Mode                  |

## installation

```bash

 git clone https://github.com/Sels13/test1.git

 ```

 ```bash

 sudo npm install 

 ```
 
```bash

 sudo yarn dev 

```


```bash

 sudo npm dev 

```